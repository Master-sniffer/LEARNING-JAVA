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

public class Welcome_Scr {

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
    private Button Chang;

    @FXML
    private Button Del;

    @FXML
    private Button Add;

    @FXML
    private Button View;

    @FXML
    void AddUser(ActionEvent event) {
        try {

            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Add_User.fxml"));
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
    void ChangeUser(ActionEvent event) {
        try {

            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ChangeUser.fxml"));
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
    void CheckTheTime(ActionEvent event) {

    }

    @FXML
    void Delete(ActionEvent event) {
        try{
            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteUser.fxml"));
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
    void ShowAuthor(ActionEvent event) {
        try{
            Stage stages = (Stage) View.getScene().getWindow();

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
    void ViewUser(ActionEvent event) {
        try {

            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Add_User.fxml"));
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
        assert Author != null : "fx:id=\"Author\" was not injected: check your FXML file 'Welcome.fxml'.";
        assert Time != null : "fx:id=\"Time\" was not injected: check your FXML file 'Welcome.fxml'.";
        assert Chang != null : "fx:id=\"Chang\" was not injected: check your FXML file 'Welcome.fxml'.";
        assert Del != null : "fx:id=\"Del\" was not injected: check your FXML file 'Welcome.fxml'.";
        assert Add != null : "fx:id=\"Add\" was not injected: check your FXML file 'Welcome.fxml'.";
        assert View != null : "fx:id=\"View\" was not injected: check your FXML file 'Welcome.fxml'.";

    }
}
