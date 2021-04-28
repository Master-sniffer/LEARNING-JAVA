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
    void exit(ActionEvent event) throws IOException {
        App.setRoot("welcome_screen");
    }

    @FXML
    void make(ActionEvent event) throws IOException {
        if (!login.getText().toString().equals("") && !password.getText().toString().equals("") ){
            Database database = new Database();
            theatre theatre = new theatre();
            theatre.setLogin(login.getText().toString());
            theatre.setPassword(password.getText().toString());
            int da = database.Getscene(theatre);
            if (da>0){
                App.setRoot("for_admin");
            } else {
                info.setText("Такой пользователь не был найден !");
            }
        } else {
            info.setText("Ошибка ! Исправьте проблему");
        }
    }

    @FXML
    void initialize() {

    }
}
