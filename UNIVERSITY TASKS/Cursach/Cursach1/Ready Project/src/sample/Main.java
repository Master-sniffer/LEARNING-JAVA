package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("Welcome_Screen.fxml"));
        primaryStage.setTitle("Ч ? Г ? К ?");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();



    }


    public static void main(String[] args) {

        String musicFile = "src/sample/JoJo's Bizarre Adventure_Golden Wind OST_ _Giorno's Theme_ Il vento d'oro (Main Theme) (320  kbps).mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.28);
        mediaPlayer.play();

        launch(args);


    }
}
