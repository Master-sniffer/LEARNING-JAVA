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

public class AddUser {

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
    private TextField surname;

    @FXML
    private TextField age;

    @FXML
    private TextField flight;

    @FXML
    private TextField serial;

    @FXML
    private TextField passport;

    @FXML
    private Button Con;

    @FXML
    private ToggleButton Gender;

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
    void ChangeGender(ActionEvent event) {
        if (Gender.getText().equals("Муж")){
            Gender.setText("Жен");
        }
        else {
            Gender.setText("Муж");
        }
    }

    @FXML
    void CheckTheTime(ActionEvent event) {
        try{
            Stage stages = (Stage) BB.getScene().getWindow();

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
    void Confirm(ActionEvent event) {
        if (!name.getText().equals("") && !surname.getText().equals("") && !age.getText().equals("")) {

            //System.out.println(age.getText().getClass().getSimpleName());

            DATABASE dbhandler = new DATABASE();


            String Firstname = name.getText();
            String Surname = surname.getText();
            Integer Age;
            String gender = "NULL";
            Integer Flight = 0;
            Integer Serial = 0;
            Integer Number = 0 ;

            String Serial_Check;
            String Number_Check;

            try {

                 Flight = Integer.parseInt(flight.getText());
//                 Serial = Integer.parseInt(serial.getText());
//                 Number = Integer.parseInt(passport.getText());

            } catch (Exception e){
                 Flight = 0;
            }

            try {
                gender = Gender.getText();

            } catch (Exception e){
                gender = "NULL";
            }

            try {
                Age = Integer.parseInt(age.getText());

            } catch (Exception e){
                Age=18;
            }

            try {
                Serial_Check = (serial.getText());
                Number_Check = (passport.getText());

                Serial =Integer.parseInt(Serial_Check.substring(0, 4));
                Number = Integer.parseInt(Number_Check.substring(0, 6));

            } catch (Exception e){
                Serial = 0;
                Number = 0 ;
            }


            System.out.println(Number);
            System.out.println(Serial);
            User user = new User(Firstname, Surname, gender, Flight, Number, Serial, Age);
            Integer res= dbhandler.SignIpUser(user);

            if (res!=0){
                lab.setText("Made a new user");
            } else {
                lab.setText("Hm, something went wrong");
            }
        }
    }
    @FXML
    private Label lab;
    @FXML
    void initialize() {

    }
}
