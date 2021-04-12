package org.example;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class SortWhat {

    public static ArrayList<String> Array = new ArrayList<>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox IDS;

    @FXML
    private CheckBox USERNAME;

    @FXML
    private CheckBox FIRSTNAME;

    @FXML
    private CheckBox LASTNAME;

    @FXML
    private CheckBox GENDER;

    @FXML
    private CheckBox LOCATION;

    @FXML
    private CheckBox SCORE;

    @FXML
    private Button Continue;

    @FXML
    private Button bb;

    @FXML
    private CheckBox Date;

    @FXML
    void Back(ActionEvent event) {
        try {

            String musicFile = "src/main/resources/org/example/darude-sandstorm-flute-anime-version-mp3cut.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            Stage stages = (Stage) bb.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome_Screen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stages.close();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    @FXML
    void Proceed(ActionEvent event) {


        if (IDS.isSelected()){
            this.Array.add("idusers");
        } else {
            this.Array.add("");
        }

        if (USERNAME.isSelected()){
            this.Array.add("username");
        } else {
            this.Array.add("");
        }

        if (FIRSTNAME.isSelected()){
            this.Array.add("firstname");
        } else {
            this.Array.add("");
        }

        if (LASTNAME.isSelected()){
            this.Array.add("lastname");
        } else {
            this.Array.add("");
        }

        if (GENDER.isSelected()){
            this.Array.add("gender");
        } else {
            this.Array.add("");
        }

        if (LOCATION.isSelected()){
            this.Array.add("location");
        } else {
            this.Array.add("");
        }

        if (SCORE.isSelected()){
            this.Array.add("quest");
        } else {
            this.Array.add("");
        }

        if (Date.isSelected()){
            this.Array.add("date");
        } else {
            this.Array.add("");
        }


        try {

            Stage stages = (Stage) Continue.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SortShow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

    @FXML
    void initialize() {

    }
}
