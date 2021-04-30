package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;

public class makeScene {

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
    private TextArea scene;

    @FXML
    private TextArea data;

    @FXML
    private TextArea vistup;

    @FXML
    private TextArea repa;

    @FXML
    private TextArea grimer;

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("welcome_screen");
    }

    @FXML
    void make(ActionEvent event) throws ParseException {
        if (!login.getText().toString().equals("") && !password.getText().toString().equals("") ){
            Database database = new Database();
            theatre theatre = new theatre();
            theatre.setLogin(login.getText().toString());
            theatre.setPassword(password.getText().toString());
            theatre.setRepa(repa.getText().toString());
            theatre.setGrimer(grimer.getText().toString());
            theatre.setScenedate(data.getText());
            theatre.setScenename(scene.getText().toString());
            theatre.setVistup(vistup.getText().toString());

            database.Save_scene(theatre);
        } else {
            info.setText("Ошибка ! Исправьте проблему. Введите логин и пароль, как минимум");
        }
    }


    @FXML
    void initialize() {

    }
}
