package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;

public class change_vistup {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt;

    @FXML
    private Label info;

    @FXML
    private Button making;

    @FXML
    private TextArea vistup;

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("Screen_Change");

    }

    @FXML
    void make(ActionEvent event) throws ParseException {
        Database database = new Database();
        theatre theatre = new theatre();
        theatre.setId(for_admin.id_for_time);
        theatre.setVistup(vistup.getText().toString());
       int res =  database.ChangeSet(theatre, "vistup");
        if (res>0){
            info.setText("Успешно !");
        }
    }

    @FXML
    void initialize() {
        assert btt != null : "fx:id=\"btt\" was not injected: check your FXML file 'change_vistup.fxml'.";
        assert info != null : "fx:id=\"info\" was not injected: check your FXML file 'change_vistup.fxml'.";
        assert making != null : "fx:id=\"making\" was not injected: check your FXML file 'change_vistup.fxml'.";
        assert vistup != null : "fx:id=\"vistup\" was not injected: check your FXML file 'change_vistup.fxml'.";

    }
}
