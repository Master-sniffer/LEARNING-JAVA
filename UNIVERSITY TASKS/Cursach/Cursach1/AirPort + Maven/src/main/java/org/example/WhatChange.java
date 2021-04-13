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

public class WhatChange {

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
    private CheckBox Sure;

    @FXML
    private TextField Age;

    @FXML
    private TextField IDFlight;

    @FXML
    private TextField SerialPass;

    @FXML
    private TextField NumbPass;

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

        String query = "UPDATE users.airport SET";
        String Check = "UPDATE users.airport SET";

        if (!name.getText().toString().equals("")){
            query+=" name= "+name.getText().toString() + " ,";
        }

        if (!surname.getText().toString().equals("")){
            query+=" surname= "+surname.getText().toString() + " ,";
        }

        if (!Age.getText().toString().equals("")){
            query+=" age= "+Age.getText()+ " ,";
        }

        if (!IDFlight.getText().toString().equals("")){
            query+=" flight= "+IDFlight.getText()+ " ,";
        }

        if (!SerialPass.getText().toString().equals("")){
            query+=" serial= "+SerialPass.getText()+ " ,";
        }

        if (!NumbPass.getText().toString().equals("")){
            query+=" number= "+NumbPass.getText()+ " ,";
        }

        if (query!=Check){
            query = query.substring(0, query.length() - 1);
            System.out.println(query);
            DATABASE database = new DATABASE();
            database.ChangeUser(this.id, query);

        } else {
            lab.setText("Please Enter some text");
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
        this.id=ChangeUser.id;
    }
}
