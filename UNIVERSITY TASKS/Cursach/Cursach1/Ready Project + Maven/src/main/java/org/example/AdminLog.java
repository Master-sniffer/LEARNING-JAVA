package org.example;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AdminLog {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Korea;

    @FXML
    private TextField Logim;

    @FXML
    private PasswordField Paass;

    @FXML
    private Button Btt;

    @FXML
    void CLOSEIT(ActionEvent event) {
        try{
            String musicFile = "src/main/resources/org/example/movie_1_C2K5NH0.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();



            Stage stages = (Stage) Btt.getScene().getWindow();

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
    void KillBill(ActionEvent event) {
        if ((Logim.getText().toString().equals("admin")) && (Paass.getText().toString().equals("admin"))){
            try {

                Stage stages = (Stage) Btt.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Admin.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stages.close();


            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @FXML
    void initialize() {

    }
}
