package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class show_user {



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
        App.setRoot("welcome_screen");
    }

    @FXML
    void initialize() {
        System.out.println(enter_user.texta.toString());
        button.setText("Привет "+ enter_user.texta);
        Database database = new Database();
        List<Object[]> listes =  database.GetInfo();
        int count=0;
        System.out.println(listes.size());
        for (Object[] li : listes) {
            if (count == 4) {
                break;
            }
            if (li[8].toString().equals("scena")) {

                if (count == 0 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    namespec_0.setText(li[1].toString());
                    grimer_0.setText(li[3].toString());
                    repet_0.setText(li[4].toString());
                    vistup_0.setText(li[5].toString());
                }

                if (count == 1 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    namespec_1.setText(li[1].toString());
                    grimer_1.setText(li[3].toString());
                    repet_1.setText(li[4].toString());
                    vistup_1.setText(li[5].toString());
                }

                if (count == 2 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    namespec_2.setText(li[1].toString());
                    grimer_2.setText(li[3].toString());
                    repet_2.setText(li[4].toString());
                    vistup_2.setText(li[5].toString());
                }

                if (count == 3 && count <= listes.size() - 1) {
                    theatre theatre = new theatre();
                    namespec_3.setText(li[1].toString());
                    grimer_3.setText(li[3].toString());
                    repet_3.setText(li[4].toString());
                    vistup_3.setText(li[5].toString());
                }

                count++;
            }
        }
    }
}

