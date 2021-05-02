package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class sortVistup {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt;

    @FXML
    private Button button;

    @FXML
    private TextArea namespec_0;

    @FXML
    private TextArea namespec_1;

    @FXML
    private TextArea grimer_1;

    @FXML
    private TextArea grimer_0;

    @FXML
    private TextArea repet_0;

    @FXML
    private TextArea repet_1;

    @FXML
    private TextArea vistup_0;

    @FXML
    private TextArea vistup_1;

    @FXML
    private TextArea vistup_2;

    @FXML
    private TextArea repet_2;

    @FXML
    private TextArea grimer_2;

    @FXML
    private TextArea namespec_2;

    @FXML
    private TextArea namespec_3;

    @FXML
    private TextArea grimer_3;

    @FXML
    private TextArea repet_3;

    @FXML
    private TextArea vistup_3;

    @FXML
    void changeUser(ActionEvent event) {

    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("sortBy");
    }

    @FXML
    void initialize() {

        button.setText("Привет, гость");
        Database database = new Database();
        List<theatre> listes =  database.sortirovka("Vistup");
        System.out.println(listes);
        int count=0;
        System.out.println(listes.size());
        for (theatre li : listes) {
            System.out.println();
            if (count == 4) {
                break;
            }
            if (li.getRole().toString().equals("scena")) {

                if (count == 0 && count <= listes.size() - 1) {
                    namespec_0.setText(li.getScenename().toString());
                    grimer_0.setText(li.getGrimer().toString());
                    repet_0.setText(li.getRepa().toString());
                    vistup_0.setText(li.getScenedate().toString());
                }

                if (count == 1 && count <= listes.size() - 1) {
                    namespec_1.setText(li.getScenename().toString());
                    grimer_1.setText(li.getGrimer().toString());
                    repet_1.setText(li.getRepa().toString());
                    vistup_1.setText(li.getScenedate().toString());
                }

                if (count == 2 && count <= listes.size() - 1) {
                    namespec_2.setText(li.getScenename().toString());
                    grimer_2.setText(li.getGrimer().toString());
                    repet_2.setText(li.getRepa().toString());
                    vistup_2.setText(li.getScenedate().toString());
                }

                if (count == 3 && count <= listes.size() - 1) {
                    namespec_3.setText(li.getScenename().toString());
                    grimer_3.setText(li.getGrimer().toString());
                    repet_3.setText(li.getRepa().toString());
                    vistup_3.setText(li.getScenedate().toString());
                }

                count++;
            }
        }

    }
}
