package sample;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.animations.shake;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchos;

    @FXML
    private TextField login;

    @FXML
    private TextField passwd;

    @FXML
    private Button auth;

    @FXML
    private Button loginSignUp;

    @FXML
    void initialize() {

        auth.setOnAction(event -> {
            String logintext =login.getText().trim(); // удаляет лишние пробелы
            String LoginPassword = passwd.getText().trim();

            if (!logintext.equals("") && !LoginPassword.equals("")) {
                loginuser (logintext , LoginPassword);
            }
            else {
                System.out.println("failure - failure !");
            }


        });



        loginSignUp.setOnAction(event -> {
            openWindow("/sample/SignUp.fxml");
        });
    }

    private void loginuser(String logintext, String loginPassword) {
        DatabaseHandler dbhandler = new DatabaseHandler();
        User user = new User();
        user.setUsername(logintext);
        user.setPassword(loginPassword);
        ResultSet resultSet = dbhandler.GetUser(user);

        int counter = 0;


        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            counter++;
        }


        if (counter>=1){


        openWindow("/sample/sample.fxml");

            System.out.println("Noice job, nigga");
        } else {
            shake userlogin = new shake(login);
            shake userpass = new shake(passwd);
            userlogin.playAnim();
            userpass.playAnim(); // запускаем анимацию

        }
    }

    public void openWindow (String window) {
        loginSignUp.getScene().getWindow().hide(); // прячем окно

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
