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
        App.setRoot("for_admin");
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
            theatre.setRole("scena");

            if (repa.getText().toString().equals("")){
                theatre.setRepa("Пока неизвестно");
            }

            if (grimer.getText().toString().equals("")){
                theatre.setGrimer("Пока неизвестно");
            }

            if (data.getText().toString().equals("")){
                theatre.setScenedate("1970-01-01");
            }

            if (scene.getText().toString().equals("")){
                theatre.setScenename("Пока неизвестно");
            }

            if (vistup.getText().toString().equals("")){
                theatre.setVistup("Пока неизвестно");
            }

            database.Save_scene(theatre);
        } else {
            info.setText("Ошибка ! Исправьте проблему. Введите логин и пароль, как минимум");
        }
    }


    @FXML
    void initialize() {

    }
}
