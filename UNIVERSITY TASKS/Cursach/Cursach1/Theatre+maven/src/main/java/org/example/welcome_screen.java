package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class welcome_screen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_log;

    @FXML
    private Button admin;

    @FXML
    private Button regis;

    @FXML
    private Button afisa;

    @FXML
    void admin_log(ActionEvent event) throws IOException {
        App.setRoot("enter_admin");
    }

    @FXML
    void sh_auth(ActionEvent event) {

    }

    @FXML
    void afisha(ActionEvent event) throws IOException {
        App.setRoot("");
    }

    @FXML
    void login(ActionEvent event) throws IOException {
        App.setRoot("enter_user");
    }

    @FXML
    void register(ActionEvent event) throws IOException {
        App.setRoot("make_user");
    }

    @FXML
    void initialize() {

    }
}
