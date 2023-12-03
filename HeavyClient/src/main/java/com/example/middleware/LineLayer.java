package com.example.middleware;

import com.gluonhq.maps.MapLayer;
import com.gluonhq.maps.MapPoint;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

public class LineLayer extends MapLayer {
    private Color color;

    private int width = 10;

    private MapPoint[] points = new MapPoint[0];
    private final Polyline polyline = new Polyline();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public LineLayer() {
        this.color = Color.BLACK;
        this.getChildren().add(polyline);
    }

    public void setPoints(MapPoint[] points) {
        this.points = points;
    }

    @Override
    protected void layoutLayer() {
        polyline.getPoints().clear();
        for (MapPoint point : points) {
            Point2D mapPoint = getMapPoint(point.getLatitude(), point.getLongitude());
            polyline.getPoints().add(mapPoint.getX());
            polyline.getPoints().add(mapPoint.getY());
        }
        polyline.setStroke(color);
        polyline.setStrokeWidth(width);
        polyline.setVisible(true);
    }
}
