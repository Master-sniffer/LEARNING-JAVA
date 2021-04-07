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
import java.net.URL;
import java.util.ResourceBundle;

public class Finis {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Finish;

    @FXML
    void Finish_theGame(ActionEvent event) {
        try{
            Stage stages = (Stage) Finish.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome_Screen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stages.close();

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void initialize() {
        String musicFile = "src/main/resources/org/example/verbalase-beatbox-cut_1_1.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

    }
}