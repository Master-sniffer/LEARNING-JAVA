package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    private Button Author;

    @FXML
    void ShowAuthor(ActionEvent event) {
        try{
            Stage stages = (Stage) Reg.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OfAuthor.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void initialize() {
        Reg.setOnAction(event -> {

            String musicFile = "src/main/resources/org/example/spank-3.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            openWindow("SignUp.fxml");
        });

        Log.setOnAction(event -> {

            String musicFile = "src/main/resources/org/example/fisting-is-300.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

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
