module com.example.middleware {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.maps;
    requires com.fasterxml.jackson.databind;
    requires jakarta.xml.bind;
    requires jakarta.xml.ws;
    requires java.naming;
    requires com.rabbitmq.client;
    opens com.example.middleware to javafx.fxml;
    exports com.example.middleware;
    exports com.example.middleware.routing;
    opens com.example.middleware.routing to org.eclipse.persistence.core;

}