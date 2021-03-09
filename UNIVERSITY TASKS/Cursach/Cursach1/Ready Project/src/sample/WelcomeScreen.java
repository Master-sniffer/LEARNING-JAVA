package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Log;

    @FXML
    private Button Reg;

    @FXML
    void initialize() {
        Reg.setOnAction(event -> {
            openWindow("SignUp.fxml");
        });

        Log.setOnAction(event -> {
            openWindow("sample.fxml");

        });
    }



    public void openWindow (String window) {
        Reg.getScene().getWindow().hide(); // прячем окно

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window)); // показываем какое окно грузить

        try {
            loader.load(); // пытаемся его загрузить
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();

        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
