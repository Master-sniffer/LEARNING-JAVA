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

            DATABASE dbhandler = new DATABASE();


            String Firstname = name.getText();
            String Surname = surname.getText();
            Integer Age = Integer.parseInt(age.getText());
            String gender = "NULL";
            Integer Flight = 0;
            Integer Serial = 0;
            Integer Number = 0 ;
            try {
                 gender = Gender.getText();

                 Flight = Integer.parseInt(flight.getText());
                 Serial = Integer.parseInt(serial.getText());
                 Number = Integer.parseInt(passport.getText());
                System.out.println(gender);
            } catch (Exception e){
                 gender = "NULL";
                 Flight = 0;
                 Serial = 0;
                 Number = 0 ;
            }



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
