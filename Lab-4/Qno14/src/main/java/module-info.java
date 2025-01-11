module org.example.qno14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.qno14 to javafx.fxml;
    exports org.example.qno14;
}