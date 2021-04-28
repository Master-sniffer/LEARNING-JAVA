package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class for_admin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt;

    @FXML
    private Button user;

    @FXML
    private TextArea datafield_0;

    @FXML
    private TextArea idfield_0;

    @FXML
    private TextArea idfield_1;

    @FXML
    private TextArea idfield_2;

    @FXML
    private TextArea idfield_3;

    @FXML
    private TextArea idfield_4;

    @FXML
    private TextArea idfield_5;

    @FXML
    private TextArea datafield_1;

    @FXML
    private TextArea datafield_2;

    @FXML
    private TextArea datafield_3;

    @FXML
    private TextArea datafield_4;

    @FXML
    private TextArea datafield_5;

    @FXML
    private TextArea name_scene_0;

    @FXML
    private TextArea grim_0;

    @FXML
    private TextArea repa_0;

    @FXML
    private TextArea vist_0;

    @FXML
    private TextArea name_scene_1;

    @FXML
    private TextArea name_scene_2;

    @FXML
    private TextArea grim_2;

    @FXML
    private TextArea repa_2;

    @FXML
    private TextArea vist_2;

    @FXML
    private TextArea vist_3;

    @FXML
    private TextArea name_scene_3;

    @FXML
    private TextArea grim_3;

    @FXML
    private TextArea grim_1;

    @FXML
    private TextArea repa_1;

    @FXML
    private TextArea vist_1;

    @FXML
    private TextArea repa_3;

    @FXML
    private TextArea name_scene_4;

    @FXML
    private TextArea grim_4;

    @FXML
    private TextArea repa_4;

    @FXML
    private TextArea vist_4;

    @FXML
    private TextArea vist_5;

    @FXML
    private TextArea repa_5;

    @FXML
    private TextArea grim_5;

    @FXML
    private TextArea name_scene_5;

    @FXML
    private Button btt1;

    @FXML
    void chng(ActionEvent event) {

    }

    @FXML
    void adduser(ActionEvent event) throws IOException {
        App.setRoot("make_scene");
    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("welcome_screen");
    }

    @FXML
    void initialize() {
        Database database = new Database();
        List<Object[]> listes =  database.GetInfo();
        int count=0;
        for (Object[] li : listes){
            if (count==5){
                break;
            }

            if (count==0){
                theatre theatre = new theatre();
                System.out.println(li[0].toString());
            }
        }
    }
}
