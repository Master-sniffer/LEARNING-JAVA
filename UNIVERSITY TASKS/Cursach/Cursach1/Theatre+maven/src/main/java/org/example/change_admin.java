package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class change_admin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField log;

    @FXML
    private PasswordField pass;

    @FXML
    private Button ext;

    @FXML
    void change(ActionEvent event) {
Database database= new Database();
database.changeadmin(log.getText().toString() , pass.getText().toString());
    }

    @FXML
    void exit(ActionEvent event) throws IOException {
App.setRoot("for_admin");
    }

    @FXML
    void initialize() {
        assert log != null : "fx:id=\"log\" was not injected: check your FXML file 'change_admin.fxml'.";
        assert pass != null : "fx:id=\"pass\" was not injected: check your FXML file 'change_admin.fxml'.";
        assert ext != null : "fx:id=\"ext\" was not injected: check your FXML file 'change_admin.fxml'.";

    }
}
