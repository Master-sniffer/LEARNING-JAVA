package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchos;

    @FXML
    private Button authSignUp;

    @FXML
    private TextField SignUpName;

    @FXML
    private TextField SignUpSurname;

    @FXML
    private TextField SignUpLogin;

    @FXML
    private TextField SignUpPassword;

    @FXML
    private TextField SignUpCountry;

    @FXML
    private CheckBox SgnUpMale;

    @FXML
    private CheckBox SignUpFemale;

    @FXML
    private Button backd;

    @FXML
    void loadold(ActionEvent event)  {
        try{
            Stage stages = (Stage) backd.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome_Screen.fxml"));
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
    void initialize() {



        authSignUp.setOnAction(event -> {

            SignUpNewUser();
        });

    }

    private void SignUpNewUser() {
        DatabaseHandler dbhandler = new DatabaseHandler();

        String firstname = SignUpName.getText();
        String surname = SignUpSurname.getText();
        String password = SignUpPassword.getText();
        String gender = "";
        String location = SignUpCountry.getText();
        String Username = SignUpLogin.getText();

        if (SgnUpMale.isSelected())
            gender="Гей";
        else
            gender="Да";

        User user = new User(firstname, surname,Username ,password, location , gender);

        dbhandler.SignIpUser(user);

    }

    public void openWindow (String window) {
        authSignUp.getScene().getWindow().hide(); // прячем окно

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window)); // показываем какое окно грузить

        try {
            loader.load(); // пытаемся его загрузить
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();

        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}

