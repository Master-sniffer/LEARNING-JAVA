package org.example;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class FilterBazar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private LineChart<?, ?> Stata;

    @FXML
    private CategoryAxis THISX;

    @FXML
    private NumberAxis THISY;

    @FXML
    void initialize() {
        XYChart.Series series = new XYChart.Series();
        ArrayList<LocalDate> Array = NewBazar.Array;
        Database database = new Database();
        List<Object[]> resultat = database.ChartBoard(Array);

        for (Object[] row : resultat){
            series.getData().add(new XYChart.Data(row[1].toString(),row[2]));
        }
        Stata.getData().addAll(series);

    }
}
