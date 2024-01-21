module com.example.beadproba1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.beadproba1 to javafx.fxml;
    exports com.example.beadproba1;
}