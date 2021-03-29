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



import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

// THESE ARE NEEDED TO PARSE

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


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
    private Label QuestNumb;

    @FXML
    void initialize() throws IOException {

        QuestNumb.setText("Question number " + Integer.toString(Controller.Score));
        //QuestionGiven.setText(Integer.toString(Controller.Score));
        String a = GetAQuestion();

    }

    public String GetAQuestion() throws IOException {
         String Question="";

        URL website = new URL("https://db.chgk.info/xml/random");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("src/sample/Quest.xml");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        // Now let's parse the file

        try {

            File fXmlFile = new File("src/sample/Quest.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("question");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    // System.out.println("Staff id : " + eElement.getAttribute("QuestionId")); // WE USE THIS ONE IF WE HAVE SMTH LIKE <staff id="1001">
                    System.out.println("Question : " + eElement.getElementsByTagName("Question").item(0).getTextContent());
                    System.out.println("Answer : " + eElement.getElementsByTagName("Answer").item(0).getTextContent());


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


         return  Question;
    }

}
