package org.example.qno15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

    @FXML
    private RadioButton radioButton1;

    @FXML
    private RadioButton radioButton2;

    @FXML
    private CheckBox acceptTermsCheckBox;

    @FXML
    private Hyperlink hyperlink;

    @FXML
    private MenuItem openMenuItem;

    @FXML
    private MenuItem exitMenuItem;

    private final ToggleGroup toggleGroup;

    public HelloController() {
        // Initialize ToggleGroup
        toggleGroup = new ToggleGroup();
    }

    @FXML
    public void initialize() {
        // Set ToggleGroup for radio buttons
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
    }

    // Handle the Submit button click
    @FXML
    protected void onSubmitButtonClick(ActionEvent actionEvent) {
        // Display user input in the Label
        welcomeText.setText("Submitted: " + textField.getText());
    }

    // Handle the Hyperlink click
    @FXML
    protected void onHyperlinkClick(ActionEvent actionEvent) {
        welcomeText.setText("Hyperlink clicked!");
    }

    // Handle the Open File menu item click
    @FXML
    protected void onOpenFileClick(ActionEvent actionEvent) {
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            welcomeText.setText("File selected: " + file.getName());
        }
    }

    // Handle the Exit menu item click
    @FXML
    protected void onExitMenuClick(ActionEvent actionEvent) {
        System.exit(0);
    }

}
