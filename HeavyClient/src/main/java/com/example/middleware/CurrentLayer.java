package com.example.middleware;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;
import javafx.geometry.Point2D;
import javafx.scene.shape.Circle;

import java.util.Map;

public class CurrentLayer extends MapLayer {

    Circle circle = new Circle(

    );

    MapPoint mapPoint = new MapPoint(0,0);

    CurrentLayer() {
        circle.setVisible(false);
        getChildren().add(circle);
    }

    void setPosition(MapPoint mapPoint) {
        this.mapPoint = mapPoint;

    }

    @Override
    protected void layoutLayer() {
        super.layoutLayer();
        circle.setVisible(true);
        Point2D point2D = getMapPoint(mapPoint.getLatitude(), mapPoint.getLongitude());
        circle.setRadius(10);
        circle.setCenterX(point2D.getX());
        circle.setCenterY(point2D.getY());

    }
}
