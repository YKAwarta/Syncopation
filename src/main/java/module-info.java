module com.alfaisal.syncopation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.alfaisal.syncopation to javafx.fxml;
    exports com.alfaisal.syncopation;
}