package com.example.middleware;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.util.Pair;

public class PoiLayer extends MapLayer {


    private final ObservableList<Pair<MapPoint, Node>> points = FXCollections.observableArrayList();

    public PoiLayer() {
    }

    public void addPoint(MapPoint p, Node icon) {
        points.add(new Pair<>(p, icon));
        this.getChildren().add(icon);
        this.markDirty();
    }

    public void setPoints(MapPoint[] p, Node[] icon) {
        this.getChildren().clear();
        for (int i = 0; i < p.length; i++) {
            points.add(new Pair<>(p[i], icon[i]));
            this.getChildren().add(icon[i]);
        }
        this.markDirty();
    }

    @Override
    protected void layoutLayer() {
        for (Pair<MapPoint, Node> candidate : points) {
            MapPoint point = candidate.getKey();
            Node icon = candidate.getValue();
            Point2D mapPoint = getMapPoint(point.getLatitude(), point.getLongitude());
            icon.setVisible(true);
            icon.setTranslateX(mapPoint.getX());
            icon.setTranslateY(mapPoint.getY());
        }
    }

}