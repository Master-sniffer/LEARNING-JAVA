package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Question {

    private Integer Score;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AnswerWrite;

    @FXML
    private Button nextqe;

    @FXML
    private Button buttonBACK;

    @FXML
    private Label QuestionGiven;

    @FXML
    private Button Skipper;

    @FXML
    void BACCK(ActionEvent event) {

    }

    @FXML
    void NextQes(ActionEvent event) {

    }

    @FXML
    void SkipQuest(ActionEvent event) {

    }

    @FXML
    void initialize() {

        System.out.println("yeap");
        System.out.println(Score);
        QuestionGiven.setText(Integer.toString(5));
    }

    public void MakeScore(Integer Score){
//        System.out.println("Here are the scores");
//        System.out.println(Score);
//        System.out.println(this.Score);
//        this.Score=Score;
//        System.out.println(this.Score);

    }

}
