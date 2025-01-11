module org.example.qno15 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.qno15 to javafx.fxml;
    exports org.example.qno15;
}