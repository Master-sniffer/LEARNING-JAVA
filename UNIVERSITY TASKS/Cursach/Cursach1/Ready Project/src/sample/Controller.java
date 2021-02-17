package sample;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchos;

    @FXML
    private TextField login;

    @FXML
    private Button auth;

    @FXML
    private Button loginSignUp;

    @FXML
    void initialize() {
        auth.setOnAction(actionEvent -> {System.out.println("You've come to the wrong house, fool");});

    }
}
