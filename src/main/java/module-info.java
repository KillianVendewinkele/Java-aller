module com.example.projet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.projet to javafx.fxml;
    exports com.example.projet;
}