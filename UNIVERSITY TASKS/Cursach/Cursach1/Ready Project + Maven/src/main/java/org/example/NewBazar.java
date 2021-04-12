package org.example;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.example.animations.shake;

public class NewBazar {

    public static ArrayList<LocalDate> Array = new ArrayList<>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Continue;

    @FXML
    private CheckBox Ticka;

    @FXML
    private Button BB;

    @FXML
    private TextField data1;

    @FXML
    private TextField data2;

    @FXML
    void Back(ActionEvent event) {
        try{
            String musicFile = "src/main/resources/org/example/deja-vu.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            Stage stages = (Stage) BB.getScene().getWindow();

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
    void MAKEITHAPPEN(ActionEvent event) {
        if ((!data1.getText().toString().equals("") && Ticka.isSelected() ) || (!data2.getText().toString().equals("") && !data1.getText().toString().equals("") ) ){

            this.Array.add(LocalDate.parse(data1.getText().toString()));
            if (Ticka.isSelected()){
                this.Array.add(LocalDate.now());
            } else {
                this.Array.add(LocalDate.parse(data2.getText().toString()));
            }
            try {

                Stage stages = (Stage) Continue.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FilterBazar.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();


            } catch (Exception e) {
                System.err.println(e.getMessage());
            }


        } else {
            shake userlogin = new shake(Continue);
            userlogin.playAnim();

        }
    }

    @FXML
    void initialize() {

    }
}
