package org.example;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SortShow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea Show;

    @FXML
    void initialize() {

        ArrayList<String> Array = SortWhat.Array;
        Database dbhandler = new Database();

        String text="";

        List result = dbhandler.Sorting(Array);

        for (Iterator iterator = result.iterator(); iterator.hasNext();){
            text+=iterator.next().toString() + "\n";

        }
        Show.setText(text);
    }
}
