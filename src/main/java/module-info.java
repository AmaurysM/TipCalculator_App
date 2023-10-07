module com.example.tipcalculator_app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tipcalculator_app to javafx.fxml;
    exports com.example.tipcalculator_app;
}