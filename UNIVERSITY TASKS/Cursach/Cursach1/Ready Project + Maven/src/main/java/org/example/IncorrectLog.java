package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class IncorrectLog {

    @FXML
    private Button Sample;

    @FXML
    private Button Reg;

    @FXML
    private TextField ANS;

    @FXML
    void BackToSAmple(ActionEvent event) {

        String musicFile = "src/main/resources/org/example/sanic_2E0Aa1p.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.getOnRepeat();
        mediaPlayer.play();

        try{
            Stage stages = (Stage) Reg.getScene().getWindow();

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
    void Register(ActionEvent event) {

        String musicFile = "src/main/resources/org/example/annihilation-gun.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.getOnRepeat();
        mediaPlayer.play();

        try{
            Stage stages = (Stage) Reg.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Question_N_Answer.fxml"));
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
        ANS.setText("Ответ все это время был "+ org.example.Question.answ);
    }

}
