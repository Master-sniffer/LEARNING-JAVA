package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class change_date {

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
        App.setRoot("Screen_Change");

    }

    @FXML
    void make(ActionEvent event) {
        if (!data.getText().toString().equals("") && (!grimer.getText().toString().equals("") || !repa.getText().toString().equals("") || !vistup.getText().toString().equals("") || !scene.getText().toString().equals("") || !password.getText().toString().equals("") || !login.getText().toString().equals(""))){
            theatre theatre = new theatre();
            theatre.setGrimer(grimer.getText().toString());
            theatre.setVistup(vistup.getText().toString());
            theatre.setScenename(scene.getText().toString());
            theatre.setPassword(password.getText().toString());
            theatre.setLogin(login.getText().toString());
            theatre.setRepa(repa.getText().toString());
            Database database = new Database();
            database.ChangeSet(theatre , "scenedate",data.getText().toString());
        } else {
            info.setText("Проверьте все данные еще раз!");
        }
    }

    @FXML
    void initialize() {

    }
}
