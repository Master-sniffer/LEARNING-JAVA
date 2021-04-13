package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ChangeUser {

    public static Integer id;

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
    private TextField name;

    @FXML
    private Label lab;

    @FXML
    private TextField surname;

    @FXML
    private Button Con;

    @FXML
    private Button BB;

    @FXML
    void Back(ActionEvent event) {
        try {

            Stage stages = (Stage) BB.getScene().getWindow();

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
    void CheckTheTime(ActionEvent event) {

    }

    @FXML
    void Confirm(ActionEvent event) {
        if (!name.getText().toString().equals("") && !surname.getText().toString().equals("")){
            DATABASE database = new DATABASE();
            this.id = database.GetUser(name.getText().toString() ,surname.getText().toString() );

            try {

                Stage stages = (Stage) BB.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WhatChange.fxml"));
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
    void ShowAuthor(ActionEvent event) {
        try{
            Stage stages = (Stage) BB.getScene().getWindow();

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
    void initialize() {

    }
}
