package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchos;

    @FXML
    void initialize() {
        assert anchos != null : "fx:id=\"anchos\" was not injected: check your FXML file 'SecondWindow.fxml'.";

    }
}