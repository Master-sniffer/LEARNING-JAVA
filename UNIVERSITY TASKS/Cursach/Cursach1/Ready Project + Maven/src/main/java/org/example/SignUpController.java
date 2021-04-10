package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchos;

    @FXML
    private Button authSignUp;

    @FXML
    private TextField SignUpName;

    @FXML
    private TextField SignUpSurname;

    @FXML
    private TextField SignUpLogin;

    @FXML
    private TextField SignUpPassword;

    @FXML
    private TextField SignUpCountry;

    @FXML
    private CheckBox SgnUpMale;

    @FXML
    private CheckBox SignUpFemale;

    @FXML
    private Button backd;



    @FXML
    void loadold(ActionEvent event)  {
        try{
            String musicFile = "src/main/resources/org/example/deja-vu.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            Stage stages = (Stage) backd.getScene().getWindow();

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
    void loadLOG(ActionEvent event) {
        try{
            String musicFile = "src/main/resources/org/example/movie_1_C2K5NH0.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();



            Stage stages = (Stage) backd.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
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
    private Label IAMLABEL;


    @FXML
    void initialize() {

        authSignUp.setOnAction(event -> {
            if (SignUpSurname.getText()!="" && SignUpLogin.getText()!="" && SignUpPassword.getText()!="" ){

                try {
                    SignUpNewUser();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String musicFile = "src/main/resources/org/example/virtualyoutubersaythenword.mp3";

                Media sound = new Media(new File(musicFile).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                mediaPlayer.play();
            } else {
                IAMLABEL.setText("Please, Input Password, Surname and Login");
            }
        });

    }

    private void SignUpNewUser() throws IOException {
        Database dbhandler = new Database();

        String firstname = SignUpName.getText();
        String surname = SignUpSurname.getText();
        String password = SignUpPassword.getText();
        String gender = "";
        String location = SignUpCountry.getText();
        String Username = SignUpLogin.getText();

        if (SgnUpMale.isSelected())
            gender="Вертолет";
        else
            gender="Да";

        User user = new User(firstname, surname,Username ,password, location , gender , 0);

        dbhandler.Save_user(user);
        sh();


    }

    public void sh(){
        try{
            Stage stages = (Stage) backd.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("After_Reg.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }



}

