package NaughtyBitch;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class plotController {
	
	@FXML
    private StackedBarChart<String, Number> sbc;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private Button plot;

    @FXML
    private void createChart() throws IOException {
        File data = new File("# set your path here # \\data.txt");
        BufferedReader br = new BufferedReader(new FileReader(data));

        sbc.setOpacity(1);
        plot.setOpacity(0);
        plot.setDisable(true);

		XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        XYChart.Series<String, Number> series3 = new XYChart.Series<>();

        series1.setName("RON95-IV");
        series2.setName("RON95-III");
        series3.setName("E5 RON92-II");
		
		// Improvement of the plotting code
		for (int i =1; i <= 12; i++) {
            series1.getData().add(new XYChart.Data<>(Integer.toString(i), Double.parseDouble(br.readLine())));
            br.readLine();
            series2.getData().add(new XYChart.Data<>(Integer.toString(i), Double.parseDouble(br.readLine())));
            br.readLine();
            series3.getData().add(new XYChart.Data<>(Integer.toString(i), Double.parseDouble(br.readLine())));
            br.readLine();
            if (i != 12) {
                br.readLine();
                br.readLine();
            }
        }
        sbc.getData().add(series1);
        sbc.getData().add(series2);
        sbc.getData().add(series3);
        br.close();
    }


}
