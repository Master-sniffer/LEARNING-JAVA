package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.example.animations.Right_Ans;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class Question {

    org.example.DatabaseHandler dbhandler = new org.example.DatabaseHandler();
    public static String answ;
    public  static int TRY;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Fisting;

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


        System.out.println("Main MEnu");
        dbhandler.ChangeScore(Controller.Passw, Controller.Name, Controller.Score);
        try {

            String musicFile = "src/sample/darude-sandstorm-flute-anime-version-mp3cut.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            Stage stages = (Stage) QuestionGiven.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome_Screen.fxml"));
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
    void NextQes(ActionEvent event) throws InterruptedException {


        AnswerWrite.setEditable(true);
        AnswerWrite.setDisable(false);
        Right_Ans RA = new Right_Ans(nextqe);
        RA.playAnim();

        if (AnswerWrite.getText().toLowerCase().equals(this.answ.toLowerCase())) {




            String musicFile = "src/main/resources/org/example/anime-wow-sound-effect.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            System.out.println("Есть пробитие");
            Controller.Score++;
            Controller.ROW++;
            dbhandler.ChangeScore(Controller.Passw, Controller.Name, Controller.Score);
            System.out.println(Controller.ROW);
            if (Controller.ROW==5){
                System.out.println("DA");
                try {

                    Stage stages = (Stage) QuestionGiven.getScene().getWindow();

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Finish.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    stage.show();
                    stages.close();


                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            else {

                try {

                    Stage stages = (Stage) QuestionGiven.getScene().getWindow();

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Question_N_Answer.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    stage.show();
                    stages.close();


                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }

        } else {
            Controller.ROW=0;
            this.TRY--;
            Fisting.setText("Times Before Fisting Starts: " + Integer.toString(this.TRY));
            AnswerWrite.setEditable(true);
            AnswerWrite.setDisable(false);
            AnswerWrite = new TextField();

            if (this.TRY==0){
                QuestionGiven.setText("YOU HAVE LOST THE GAME\nNOOB");
                Stage stages = (Stage) QuestionGiven.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NoLogin.fxml"));
                Parent root1 = null;
                try {
                    root1 = (Parent) fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                TimeUnit.SECONDS.sleep(2);
                stage.show();
                stages.close();
            }
        }
    }


    @FXML
    void SkipQuest(ActionEvent event) {

        try {

            String musicFile = "src/main/resources/org/example/gmi2-salvaje.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);

            mediaPlayer.play();

            Stage stages = (Stage) QuestionGiven.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Question_N_Answer.fxml"));
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
    private Label QuestNumb;

    @FXML
    void initialize() throws IOException, ParserConfigurationException, SAXException {
        AnswerWrite.setEditable(true);
        AnswerWrite.setDisable(false);
        this.TRY=Controller.TRIES;
        Fisting.setText("Times Before Fisting Starts: " + Integer.toString(this.TRY));
        System.out.println(Controller.Score);
        QuestNumb.setText("Question number " + Integer.toString(Controller.Score));
        String Ques[] = GetAQuestion();
        String Qestion = Ques[0];
        String Answ = Ques[1];
        this.answ = Answ;

        QuestionGiven.setText(Qestion);

        //System.out.println(Qestion);
        //System.out.println(Answ);


    }

    public String[] GetAQuestion() throws ParserConfigurationException, SAXException, IOException {
        String Question = "";

        URL website = new URL("https://db.chgk.info/xml/random");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("src/sample/Quest.xml");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        // Now let's parse the file

        File fXmlFile = new File("src/sample/Quest.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("question");
        Node nNode = nList.item(0);
        Element eElement = (Element) nNode;

        System.out.println("Question : " + eElement.getElementsByTagName("Question").item(0).getTextContent());
        System.out.println("Answer : " + eElement.getElementsByTagName("Answer").item(0).getTextContent());

        String Quest = eElement.getElementsByTagName("Question").item(0).getTextContent();
        String Answ = eElement.getElementsByTagName("Answer").item(0).getTextContent();
        String data[] = {Quest, Answ};
        return data;


    }
}

