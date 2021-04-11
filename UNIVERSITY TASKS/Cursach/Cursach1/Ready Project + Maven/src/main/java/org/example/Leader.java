package org.example;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Leader {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Bacc;

    @FXML
    private TextField Us1;

    @FXML
    private TextField Sc1;

    @FXML
    private TextField Us11;

    @FXML
    private TextField Sc11;

    @FXML
    private TextField Sc111;

    @FXML
    private TextField Us111;

    @FXML
    void Welcome(ActionEvent event) {
        try {

            Stage stages = (Stage) Bacc.getScene().getWindow();

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
    void initialize() {
        Database dbhandler = new Database();
        List result = dbhandler.Leaderboar();
        ArrayList<String> Useri = new ArrayList<String>() ;
        ArrayList<String> Score = new ArrayList<String>() ;


        for (Iterator iterator = result.iterator(); iterator.hasNext();){
            User user = (User) iterator.next();
            Useri.add(user.getUsername());
            Score.add(user.getQuest().toString());
        }
        Us1.setText(Useri.get(0));
        Us11.setText(Useri.get(1));
        Us111.setText(Useri.get(2));

        Sc1.setText(Score.get(0));
        Sc11.setText(Score.get(1));
        Sc111.setText(Score.get(2));

    }
}

