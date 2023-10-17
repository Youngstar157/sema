module com.example.sema {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sema to javafx.fxml;
    exports com.example.sema;
}