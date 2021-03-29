package sample;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

// THESE ARE NEEDED TO PARSE

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class Question {

    DatabaseHandler dbhandler = new DatabaseHandler();
    public static String answ;

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
        if (AnswerWrite.getText().toLowerCase().equals(this.answ.toLowerCase())){

            String musicFile = "src/sample/anime-wow-sound-effect.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            System.out.println("Есть пробитие");
            Controller.Score++;
            dbhandler.ChangeScore(Controller.Passw, Controller.Name , Controller.Score);
            try{

                Stage stages = (Stage) QuestionGiven.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Question_N_Answer.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stages.close();


            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    @FXML
    void SkipQuest(ActionEvent event) {
        Controller.Score++;
    }

    @FXML
    private Label QuestNumb;

    @FXML
    void initialize() throws IOException, ParserConfigurationException, SAXException {

        System.out.println(Controller.Score);
        QuestNumb.setText("Question number " + Integer.toString(Controller.Score));
        String Ques[] = GetAQuestion();
        String Qestion = Ques[0];
        String Answ = Ques[1];
        this.answ=Answ;

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

        String Quest= eElement.getElementsByTagName("Question").item(0).getTextContent();
        String Answ = eElement.getElementsByTagName("Answer").item(0).getTextContent();
        String data[] = {Quest, Answ};
        return data;


//
//            File fXmlFile = new File("src/sample/Quest.xml");
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(fXmlFile);
//
//            doc.getDocumentElement().normalize();
//
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//
//            NodeList nList = doc.getElementsByTagName("question");
//
//            System.out.println("----------------------------");
//
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//
//                Node nNode = nList.item(temp);
//
//                System.out.println("\nCurrent Element :" + nNode.getNodeName());
//
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                    Element eElement = (Element) nNode;
//
//                    // System.out.println("Staff id : " + eElement.getAttribute("QuestionId")); // WE USE THIS ONE IF WE HAVE SMTH LIKE <staff id="1001">
//                    System.out.println("Question : " + eElement.getElementsByTagName("Question").item(0).getTextContent());
//                    System.out.println("Answer : " + eElement.getElementsByTagName("Answer").item(0).getTextContent());
//
//
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//




    }
}
