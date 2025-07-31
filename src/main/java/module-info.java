module com.example.foodmania {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foodmania to javafx.fxml;
    exports com.example.foodmania;
}