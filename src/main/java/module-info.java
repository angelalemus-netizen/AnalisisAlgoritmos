module com.example.analisisalgoritmos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.analisisalgoritmos to javafx.fxml;
    exports com.example.analisisalgoritmos;
}