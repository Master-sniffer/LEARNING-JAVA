package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewUser {

    public static List<Object[]> INFO;

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
        if (!name.getText().toString().equals("") && !surname.getText().toString().equals("")) {
            DATABASE database = new DATABASE();
            this.INFO = database.GetInfo(name.getText().toString() , surname.getText().toString());
//            for (Object[] row : INFO){
//                System.out.println();
//                User user = new User(Integer.parseInt(row[1].toString()) , Integer.parseInt(row[2].toString()) , row[3].toString(), row[4].toString(), Integer.parseInt(row[5].toString()) , Integer.parseInt(row[6].toString()) , row[7].toString()  );
//                System.out.println(user.toString());
//            }
            try {

                Stage stages = (Stage) BB.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ShowUser.fxml"));
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
