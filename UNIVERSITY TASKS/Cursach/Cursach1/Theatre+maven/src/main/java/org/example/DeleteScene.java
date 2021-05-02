package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DeleteScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt;

    @FXML
    private Label info;

    @FXML
    private TextArea textenter;

    @FXML
    void DELETE(ActionEvent event) {
        Database database = new Database();
        int result = database.DELETESCENE(Integer.parseInt(textenter.getText().toString()));
        if (result>0){
            info.setText("Сцена удалена");
        } else {
            info.setText("Что-то пошло не так...");
        }
    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("for_admin");
    }

    @FXML
    void initialize() {
        assert btt != null : "fx:id=\"btt\" was not injected: check your FXML file 'delete_scene.fxml'.";
        assert info != null : "fx:id=\"info\" was not injected: check your FXML file 'delete_scene.fxml'.";
        assert textenter != null : "fx:id=\"textenter\" was not injected: check your FXML file 'delete_scene.fxml'.";

    }
}
