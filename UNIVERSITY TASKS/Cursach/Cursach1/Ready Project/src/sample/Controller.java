package sample;
import javafx.event.ActionEvent;

import java.io.File;
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
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.animations.Otletaet;
import sample.animations.shake;

public class Controller {

    public static Integer Score;
    public  static String Name;
    public static  String Passw;
    public static Integer TRIES;
    public static Integer ROW;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchos;

    @FXML
    private TextField login;

    @FXML
    private Button auth;

    @FXML
    private TextField passwd;

    @FXML
    private Button loginSignUp;

    @FXML
    private Button back;

    @FXML
    private TextField TRY;

    @FXML
    private TextField HiddenButton;

    @FXML
    private Button German;

    @FXML
    void Delete(ActionEvent event) {
        try{
            Stage stages = (Stage) back.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("KillBill.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    @FXML
    void OldScreen(ActionEvent event) {



        try{
            String musicFile = "src/sample/my-movie-6_0RlWMvM.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            Stage stages = (Stage) back.getScene().getWindow();

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
    void RegScreen(ActionEvent event) {

        Otletaet ulet = new Otletaet(loginSignUp);
        ulet.playAnim();

        String musicFile = "src/sample/woo_htcxajK.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.getOnRepeat();
        mediaPlayer.play();

        try{
            Stage stages = (Stage) back.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
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


            this.Score=dbhandler.GetQuestion(user);
            this.Name=logintext;
            this.Passw=loginPassword;
            this.ROW=0;
            if (TRY.getText().equals("")){
                System.out.println("DADADA");
                this.TRIES=3;
            } else if (TRY.getText().equals(Integer.toString(Integer.parseInt(TRY.getText())))){
                System.out.println("WAWAWAW");
                System.out.println(Integer.parseInt(TRY.getText()));
                this.TRIES=Integer.parseInt(TRY.getText());
            } else {
                System.out.println("FAUCK");
                this.TRIES = 3;
            }


        //openWindow("/sample/sample.fxml");

        System.out.println("Noice job, nigga");
            try{

                String musicFile = "src/sample/deep-dark-fantasies.mp3";

                Media sound = new Media(new File(musicFile).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                mediaPlayer.getOnRepeat();
                mediaPlayer.play();

                Stage stages = (Stage) back.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Question_N_Answer.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stages.close();


            } catch (Exception e){
                System.err.println(e.getMessage());
            }


        } else {
            shake userlogin = new shake(login);
            shake userpass = new shake(passwd);
            userlogin.playAnim();
            userpass.playAnim(); // запускаем анимацию

            Stage stages = (Stage) back.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Wrong_house_Foool.fxml"));
            Parent root1 = null;
            try {
                root1 = (Parent) fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stages.close();


        }
        //System.out.println(Score);
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

    public void setScore(Integer Score){
        this.Score=Score;
    }

    public Integer getScore() {
        return Score;
    }

    public void SetName(String Name){
        this.Name=Name;
    }
    public String GetName() {
        return Name;
    }

    public void SetPassw(String passwd){
        this.Passw=passwd;
    }
    public String GetPassw() {
        return Passw;
    }
}

