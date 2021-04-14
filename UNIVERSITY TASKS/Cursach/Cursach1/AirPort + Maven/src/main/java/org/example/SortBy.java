package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SortBy {

    public static String decision;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Menu Author;

    @FXML
    private MenuItem Aut;

    @FXML
    private Menu Time;

    @FXML
    private MenuItem Tmm;

    @FXML
    private Button IDS;

    @FXML
    private Button AGE;

    @FXML
    private Button flight;

    @FXML
    private Button gender;

    @FXML
    private Button name;

    @FXML
    private Button numb;

    @FXML
    private Button serial;

    @FXML
    private Button surname;

    @FXML
    private Button bb;

    @FXML
    void CheckTheTime(ActionEvent event) {
        try{
            Stage stages = (Stage) bb.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Times.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void ShowAuthor(ActionEvent event) {
        try{
            Stage stages = (Stage) bb.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Author.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void back(ActionEvent event) {
        try {

            Stage stages = (Stage) bb.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
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
    private Button STAts;

    @FXML
    void STATA(ActionEvent event) {
        try {

            Stage stages = (Stage) bb.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Stata.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();



        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void goAGE(ActionEvent event) {
        this.decision="age";
        Transfer();
    }

    @FXML
    void goFLIGHT(ActionEvent event) {
        this.decision="flight";
        Transfer();
    }

    @FXML
    void goGENDER(ActionEvent event) {
        this.decision="gender";
        Transfer();
    }

    @FXML
    void goID(ActionEvent event) {
        this.decision="id";
        Transfer();
    }

    @FXML
    void goNAME(ActionEvent event) {
        this.decision="name";
        Transfer();
    }

    @FXML
    void goNUMB(ActionEvent event) {
        this.decision="number";
        Transfer();
    }

    @FXML
    void goSERIAL(ActionEvent event) {
        this.decision="serial";
        Transfer();
    }

    @FXML
    void goSURNAME(ActionEvent event) {
        this.decision="surname";
        Transfer();
    }

    public void Transfer(){
        try {

            Stage stages = (Stage) bb.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SortShow.fxml"));
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

    }
}
