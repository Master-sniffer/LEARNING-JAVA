package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class enter_admin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt;

    @FXML
    private PasswordField password;

    @FXML
    private TextArea login;

    @FXML
    private Label info;

    @FXML
    private Button making;

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void make(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btt != null : "fx:id=\"btt\" was not injected: check your FXML file 'make_user.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'make_user.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'make_user.fxml'.";
        assert info != null : "fx:id=\"info\" was not injected: check your FXML file 'make_user.fxml'.";
        assert making != null : "fx:id=\"making\" was not injected: check your FXML file 'make_user.fxml'.";

    }
}
