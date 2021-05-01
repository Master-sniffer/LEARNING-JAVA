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

    public static int id_for_time;

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
    private Button idfield_0;

    @FXML
    private Button idfield_1;

    @FXML
    private Button idfield_2;

    @FXML
    private Button idfield_3;

    @FXML
    private Button idfield_4;

    @FXML
    private Button idfield_5;

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
    void chng(ActionEvent event) throws IOException {
        App.setRoot("delete_scene"); // тут идет удаление
    }


    @FXML
    void chang_0(ActionEvent event) throws IOException {
        this.id_for_time=(Integer.parseInt(idfield_0.getText().toString()));
        if (!idfield_0.getText().toString().equals("")){
            App.setRoot("Screen_Change");
        }
    }

    @FXML
    void chang_1(ActionEvent event) throws IOException {
        this.id_for_time=(Integer.parseInt(idfield_1.getText().toString()));
        App.setRoot("Screen_Change");
    }

    @FXML
    void chang_2(ActionEvent event) throws IOException {
        this.id_for_time=(Integer.parseInt(idfield_2.getText().toString()));
        App.setRoot("Screen_Change");
    }

    @FXML
    void chang_3(ActionEvent event) throws IOException {
        this.id_for_time=(Integer.parseInt(idfield_3.getText().toString()));
        App.setRoot("Screen_Change");
    }

    @FXML
    void chang_4(ActionEvent event) throws IOException {
        this.id_for_time=(Integer.parseInt(idfield_4.getText().toString()));
        App.setRoot("Screen_Change");
    }

    @FXML
    void chang_5(ActionEvent event) throws IOException {
        this.id_for_time=(Integer.parseInt(idfield_5.getText().toString()));
        App.setRoot("Screen_Change");
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
        System.out.println(listes.size());
        for (Object[] li : listes){
            if (count==5){
                break;
            }
            if (li[8].toString().equals("scena")) {

                if (count == 0 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    idfield_0.setText(li[0].toString());
                    datafield_0.setText(li[7].toString() + " " + li[6].toString() );
                    name_scene_0.setText(li[1].toString());
                    grim_0.setText(li[3].toString());
                    repa_0.setText(li[4].toString());
                    vist_0.setText(li[5].toString());
                }

                if (count == 1 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    idfield_1.setText(li[0].toString());
                    datafield_1.setText(li[7].toString() + " " + li[6].toString());
                    name_scene_1.setText(li[1].toString());
                    grim_1.setText(li[3].toString());
                    repa_1.setText(li[4].toString());
                    vist_1.setText(li[5].toString());
                }

                if (count == 2 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    idfield_2.setText(li[0].toString());
                    datafield_2.setText(li[7].toString() + " " + li[6].toString());
                    name_scene_2.setText(li[1].toString());
                    grim_2.setText(li[3].toString());
                    repa_2.setText(li[4].toString());
                    vist_2.setText(li[5].toString());
                }

                if (count == 3 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    idfield_3.setText(li[0].toString());
                    datafield_3.setText(li[7].toString() + " " + li[6].toString());
                    name_scene_3.setText(li[1].toString());
                    grim_3.setText(li[3].toString());
                    repa_3.setText(li[4].toString());
                    vist_3.setText(li[5].toString());
                }

                if (count == 4 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    idfield_4.setText(li[0].toString());
                    datafield_4.setText(li[7].toString() + " " + li[6].toString());
                    name_scene_4.setText(li[1].toString());
                    grim_4.setText(li[3].toString());
                    repa_4.setText(li[4].toString());
                    vist_4.setText(li[5].toString());
                }

                if (count == 5 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    idfield_5.setText(li[0].toString());
                    datafield_5.setText(li[7].toString() + " " + li[6].toString());
                    name_scene_5.setText(li[1].toString());
                    grim_5.setText(li[3].toString());
                    repa_5.setText(li[4].toString());
                    vist_5.setText(li[5].toString());
                }
                count++;
            }


        }
    }
}
