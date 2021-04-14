package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ResourceBundle;

public class Welcome_Scr {

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
    private Button Chang;

    @FXML
    private Button Del;

    @FXML
    private Button Add;

    @FXML
    private Button View;

    @FXML
    void AddUser(ActionEvent event) {
        try {

            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Add_User.fxml"));
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
    void ChangeUser(ActionEvent event) {
        try {

            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ChangeUser.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stages.close();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public final String USER_AGENT = "Mozilla/5.0";


    @FXML
    void CheckTheTime(ActionEvent event) throws Exception {

            sendGet("Moscow");
            sendGet();
            sendGet();
            sendGet();

    }

    // HTTP GET request
    public void sendGet(String stra) throws Exception {

        InputStream inputStream = new URL("http://worldtimeapi.org/api/timezone/Europe/" + stra).openStream();
        Files.copy(inputStream, Paths.get("src/main/resources/org/example/file.json"), StandardCopyOption.REPLACE_EXISTING);
        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("src/main/resources/org/example/file.json");
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("datetime"));
        FileReader reader = new FileReader("src/main/resources/org/example/file.json");
        reader.close();

    }

    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();

//        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
////        reader.close();
        return jsonParser.parse(reader);

    }

//        String url = "http://worldtimeapi.org/api/timezone/Europe/Moscow";
//
//        URL obj = new URL(url);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//
//        // optional default is GET
//        con.setRequestMethod("GET");
//
//        //add request header
//        con.setRequestProperty("User-Agent", USER_AGENT);
//
//        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("Response Code : " + responseCode);
//
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(con.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//
//        //print result
//        System.out.println(response.toString());
//
//
//        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("file.json");
//        System.out.println(jsonObject);
//        System.out.println(jsonObject.get("age"));
//
//
//    }
//
//
//    public static Object readJsonSimpleDemo(String filename) throws Exception {
//        FileReader reader = new FileReader(filename);
//        JSONParser jsonParser = new JSONParser();
//        return jsonParser.parse(reader);
//    }


    @FXML
    void Delete(ActionEvent event) {
        try{
            Stage stages = (Stage) View.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteUser.fxml"));
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
    void ShowAuthor(ActionEvent event) {
        try{
            Stage stages = (Stage) View.getScene().getWindow();

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
    void ViewUser(ActionEvent event) {
        try {

            Stage stages = (Stage) View.getScene().getWindow();

            //TODO
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewUser.fxml"));
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
    void initialize() {

    }
}
