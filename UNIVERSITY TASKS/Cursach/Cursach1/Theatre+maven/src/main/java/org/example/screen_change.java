package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class screen_change {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt;

    @FXML
    void change_date(ActionEvent event) throws IOException {
        App.setRoot("change_date");
    }

    @FXML
    void change_grim(ActionEvent event) throws IOException {
        App.setRoot("change_grimerka");
    }

    @FXML
    void change_log(ActionEvent event) throws IOException {
        App.setRoot("change_login");
    }

    @FXML
    void change_pass(ActionEvent event) throws IOException {
        App.setRoot("change_password");
    }

    @FXML
    void change_repa(ActionEvent event) throws IOException {
        App.setRoot("change_repa");
    }

    @FXML
    void change_scene(ActionEvent event) throws IOException {
        App.setRoot("change_scene");
    }

    @FXML
    void change_vistup(ActionEvent event) throws IOException {
        App.setRoot("change_vistup");
    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("for_admin");
    }

    @FXML
    void initialize() {

    }
}
