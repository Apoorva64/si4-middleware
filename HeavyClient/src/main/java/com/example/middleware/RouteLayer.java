package com.example.middleware;

import com.gluonhq.maps.MapLayer;

import java.util.EventListener;

public class RouteLayer extends MapLayer implements EventListener {
    public RouteLayer() {
        this.setOnZoom(e -> {
            System.out.println("Zoom");

        });
    }

    @Override
    protected void layoutLayer() {

    }
}
