package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        primaryStage.setTitle("Airport Sys APP");
        primaryStage.setScene(new Scene(root, 935, 621));
        primaryStage.show();



    }


    public static void main(String[] args) {


        launch(args);


    }
}
