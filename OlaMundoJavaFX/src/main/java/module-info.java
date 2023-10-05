module com.example.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.olamundojavafx to javafx.fxml;
    exports com.example.olamundojavafx;
}