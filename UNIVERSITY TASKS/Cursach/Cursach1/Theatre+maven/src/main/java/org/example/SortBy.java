package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SortBy {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void Sort_repa(ActionEvent event) throws IOException {
        App.setRoot("sortRepa");
    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        App.setRoot("welcome_screen");
    }

    @FXML
    void sort_grimerka(ActionEvent event) throws IOException {
        App.setRoot("sortGrimerka");
    }

    @FXML
    void sort_name(ActionEvent event) throws IOException {
        App.setRoot("sortName");
    }

    @FXML
    void sort_vistup(ActionEvent event) throws IOException {
        App.setRoot("sortvistup");
    }

    @FXML
    void initialize() {

    }
}
