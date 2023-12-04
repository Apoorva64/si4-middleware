module com.example.middleware {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.maps;
    requires jakarta.xml.bind;
    requires jakarta.xml.ws;
    requires java.naming;
    requires com.rabbitmq.client;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    opens com.example.middleware to javafx.fxml, com.fasterxml.jackson.databind;
    exports com.example.middleware;
    exports com.example.middleware.routing;
    opens com.example.middleware.routing to org.eclipse.persistence.core;
}