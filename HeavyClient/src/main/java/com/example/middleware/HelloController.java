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


import java.io.IOException;
import java.nio.charset.StandardCharsets;
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

    public HelloController() {

    }

    @FXML
    private void route() throws IOException, TimeoutException {
        textBox.setText("");
        RoutingService routingService = new RoutingService();

        List<RoutingServiceRoute> routes = routingService.getBasicHttpBindingIRoutingService().getRoute(start.getText(), end.getText()).getRoutes().getValue().getRoutingServiceRoute();
        for (int i = 0; i < lineLayers.length; i++) {
            RoutingServiceRoute route = routes.get(i);
            MapPoint[] points = route.getPositions().getValue().getRoutingServiceSerializablePosition().stream().map(
                    position -> new MapPoint(position.getLatitude(), position.getLongitude())
            ).toArray(MapPoint[]::new);
            if (i == 0) {
                mapView.flyTo(0, points[0], 5);
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
            System.out.println(" [x] Received '" + message + "'");
            textBox.setText(message);
        } else {
            System.out.println(" [x] Received nothing");
        }
        connection.close();
    }

    public void initialize() throws IOException, TimeoutException {
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


        connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.queuePurge("routing");
        channel.close();
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
            System.out.println(" [x] Received '" + message + "'");
            textBox.setText(message + "\n" + textBox.getText());
        } else {
            System.out.println(" [x] Received nothing");
        }
        connection.close();
    }
}