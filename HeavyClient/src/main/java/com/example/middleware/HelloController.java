package com.example.middleware;

import com.example.middleware.routing.RoutingService;
import com.example.middleware.routing.RoutingServiceRoute;
import com.gluonhq.maps.MapPoint;
import com.gluonhq.maps.MapView;
import com.rabbitmq.client.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.shape.Circle;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class HelloController {

    public TextArea textBox;
    @FXML
    private MapView mapView;

    @FXML
    private Button button;

    @FXML
    private TextField start;

    @FXML
    private TextField end;
    static LineLayer[] lineLayers;
    static Tooltip[] tooltips;
    private ConnectionFactory connectionFactory;

    private CurrentLayer currentLayer;
    static String rabbitmqUri = "amqp://pewpewpew:pewpewpewnioun@localhost";

    public HelloController() {

    }

    @FXML
    private void route() throws IOException, TimeoutException {
        textBox.setText("");
        RoutingService routingService = new RoutingService();

        List<RoutingServiceRoute> routes = routingService.getBasicHttpBindingIRoutingService().getRoute(start.getText(), end.getText()).getRoutes().getValue().getRoutingServiceRoute();
        for (int i = 0; i < lineLayers.length; i++) {
            MapPoint[] points = new MapPoint[0];
            if (i < routes.size()) {
                RoutingServiceRoute route = routes.get(i);
                points = route.getPositions().getValue().getRoutingServiceSerializablePosition().stream().map(
                        position -> new MapPoint(position.getLatitude(), position.getLongitude())
                ).toArray(MapPoint[]::new);
                if (i == 0) {
                    mapView.flyTo(0, points[0], 0.1);
                }

                switch (route.getDirectionType().getValue().getName().getValue()) {
                    case "cycling-regular":
                        lineLayers[i].setColor(Color.BLUE);
                        tooltips[i].setText("Cycling" + "\n" + route.getInstructions().getValue().getDistance() + "m");
                        break;
                    case "foot-walking":
                        lineLayers[i].setColor(Color.GREEN);
                        tooltips[i].setText("Walking" + "\n" + route.getInstructions().getValue().getDistance() + "m");
                        break;
                }
            }

            lineLayers[i].setPoints(points);
            lineLayers[i].setVisible(true);
            lineLayers[i].setWidth(7);
        }
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("routing",
                false,
                false,
                false,
                null);

        GetResponse response = channel.basicGet("routing", true);
        if (response != null) {
            String message = new String(response.getBody(), StandardCharsets.UTF_8);
            Step step = new ObjectMapper().readValue(message, Step.class);
            System.out.println(" [x] Received '" + message + "'");
            textBox.setText(step.instruction + " " + "(" + step.distance + "m)");
            currentLayer.setPosition(lineLayers[0].getPoints()[0]);
        } else {
            System.out.println(" [x] Received nothing");
        }
        connection.close();
    }

    public void initialize() throws IOException, TimeoutException, URISyntaxException, NoSuchAlgorithmException, KeyManagementException {
        System.out.println("initialize");
        lineLayers = new LineLayer[3];
        for (int i = 0; i < lineLayers.length; i++) {
            lineLayers[i] = new LineLayer();
        }
        mapView.setZoom(12);
        mapView.setCenter(48.858093, 2.294694);
        tooltips = new Tooltip[3];
        for (int i = 0; i < lineLayers.length; i++) {
            LineLayer lineLayer = lineLayers[i];
            Tooltip tooltip = new Tooltip();
            tooltips[i] = tooltip;
            Tooltip.install(lineLayer, tooltip);
            mapView.addLayer(lineLayer);
        }
        currentLayer = new CurrentLayer();
        mapView.addLayer(currentLayer);


        connectionFactory = new ConnectionFactory();
        connectionFactory.setUri(rabbitmqUri);
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        try {
            channel.queuePurge("routing");
        } catch (IOException ignored) {

        }
        connection.close();
    }

    public void nextMessage(ActionEvent actionEvent) throws IOException, TimeoutException {
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("routing",
                false,
                false,
                false,
                null);

        GetResponse response = channel.basicGet("routing", true);
        if (response != null) {
            String message = new String(response.getBody(), StandardCharsets.UTF_8);
            Step step = new ObjectMapper().readValue(message, Step.class);
            MapPoint point = lineLayers[step.RouteId].getPoints()[step.way_points.get(0)];
            mapView.flyTo(0, point, 0.1);
            System.out.println(" [x] Received '" + message + "'");
            textBox.setText(step.instruction + " " + "(" + step.distance + "m)" + "\n" + textBox.getText());
            currentLayer.setPosition(point);
        } else {
            System.out.println(" [x] Received nothing");
        }
        connection.close();
    }
}