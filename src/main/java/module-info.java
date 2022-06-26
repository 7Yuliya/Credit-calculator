module com.example.credit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.credit to javafx.fxml;
    exports com.example.credit;
}