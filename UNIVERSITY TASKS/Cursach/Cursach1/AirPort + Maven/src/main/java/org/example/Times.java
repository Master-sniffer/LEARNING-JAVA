package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Times {

    public static ArrayList<String> Times = new ArrayList<String>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label TimeMSC;

    @FXML
    private Label TimeNY;

    @FXML
    private Label TimeTok;

    @FXML
    private Label TimeLO;

    @FXML
    private Label TimePR;

    @FXML
    private Label TimeMIN;

//    public static void  showTime(){
//
//    }



    @FXML
    void initialize() throws Exception {
        //System.out.println("da");
        sendGet("Europe/Moscow");
        sendGet("AMERICA/NEW_YORK");
        sendGet("ASIA/TOKYO");
        sendGet("EUROPE/LONDON");
        sendGet("EUROPE/PARIS");
        sendGet("Europe/Minsk");

        //System.out.println("prog");
        TimeMSC.setText(this.Times.get(0));
        TimeNY.setText(this.Times.get(1));
        TimeTok.setText(this.Times.get(2));
        TimeLO.setText(this.Times.get(3));
        TimePR.setText(this.Times.get(4));
        TimeMIN.setText(this.Times.get(5));

    }

    public final String USER_AGENT = "Mozilla/5.0";

    // HTTP GET request
    public void sendGet(String stra) throws Exception {

        InputStream inputStream = new URL("http://worldtimeapi.org/api/timezone/" + stra).openStream();
        Files.copy(inputStream, Paths.get("src/main/resources/org/example/file.json"), StandardCopyOption.REPLACE_EXISTING);
        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("src/main/resources/org/example/file.json");
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("datetime"));
        this.Times.add(jsonObject.get("datetime").toString());


    }

    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();


        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        reader.close();
        return  jsonObject;
    }
}
