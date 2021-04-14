package org.example;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Stata {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private LineChart<?, ?> Statiskticka;

    @FXML
    private CategoryAxis X;

    @FXML
    private NumberAxis Y;

    @FXML
    void initialize() {
        XYChart.Series series = new XYChart.Series();
        DATABASE database = new DATABASE();
        List<Object[]> resultat = database.Statistika();

        for (Object[] row : resultat){
            series.getData().add(new XYChart.Data(row[0].toString(),row[1]));
        }
        Statiskticka.getData().addAll(series);

    }
}
