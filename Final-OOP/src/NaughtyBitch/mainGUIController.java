package NaughtyBitch;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;

public class mainGUIController {

    @FXML
    private TextField Ron95IV;

    @FXML
    private TextField Ron95III;

    @FXML
    private TextField E5;

    @FXML
    private TextField fund;

    @FXML
    private TextField interest;

    @FXML
    private Button submit;

    @FXML
    private Button plotButton;

    @FXML
    private Button print;

    @FXML
    private Button endMonth;

    @FXML
    private Button newYear;

    @FXML
    private Label monthLabel;

    @FXML
    private MenuItem about;

    private int month = 1;
    private Ron95IV[] ron95IV = new Ron95IV[13];
    private Ron95III[] ron95III = new Ron95III[13];
    private E5[] e5 = new E5[13];
    private DecimalFormat df2 = new DecimalFormat(".##");


    @FXML
    private void handleSubmit() {
        System.out.println("Submitted");
        boolean check = submitEvent();
        if (check) {
            endMonth.setDisable(false);
            fund.setText(Double.toString(calFund(ron95IV[month], ron95III[month], e5[month])));
            fund.setText(fund.getText() + "kVND");
            interest.setText(Double.toString(calInterest((ron95IV[month]), ron95III[month], e5[month])));
            interest.setText(interest.getText() + "kVND");
        }

    }

    @FXML
    private void handleNewYear() {
        System.out.println("Happy New Year!");
        month = 1;
        Ron95IV.clear();
        Ron95III.clear();
        E5.clear();
        Ron95IV.setText("0");
        Ron95III.setText("0");
        E5.setText("0");
        fund.clear();
        interest.clear();
        Ron95IV.setDisable(false);
        Ron95IV.setFocusTraversable(true);
        Ron95IV.setMouseTransparent(false);
        Ron95III.setDisable(false);
        Ron95III.setFocusTraversable(true);
        Ron95III.setMouseTransparent(false);
        E5.setDisable(false);
        E5.setFocusTraversable(true);
        E5.setMouseTransparent(false);
        submit.setDisable(false);
        print.setDisable(true);
        newYear.setDisable(true);
        newYear.setOpacity(0);
        plotButton.setDisable(true);
        endMonth.setDisable(true);
        monthLabel.setText("Month: " + month);
    }

    @FXML
    private void endMonthEvent() {
        if (month < 12) {
            System.out.println("End Month");
            endMonth.setDisable(true);
            Ron95IV.setText("0");
            Ron95III.setText("0");
            E5.setText("0");
            fund.clear();
            interest.clear();
            month++;
            monthLabel.setText("Month: " + month);
        } else {
            System.out.println("THE END OF THE FUCKING WORLD");
            Ron95IV.setDisable(true);
            Ron95IV.setFocusTraversable(false);
            Ron95IV.setMouseTransparent(true);
            Ron95III.setDisable(true);
            Ron95III.setFocusTraversable(false);
            Ron95III.setMouseTransparent(true);
            E5.setDisable(true);
            E5.setFocusTraversable(false);
            E5.setMouseTransparent(true);
            submit.setDisable(true);
            print.setDisable(false);
            if (month == 12) {
                monthLabel.setText("3");
                month++;
                return;
            }
            if (month == 13) {
                monthLabel.setText("2");
                month++;
                return;
            }
            if (month == 14) {
                monthLabel.setText("1");
                month++;
                return;
            }
            if (month == 15) {
                monthLabel.setText("Keep on going!");
                month++;
                return;
            }
            if (month == 16) {
                monthLabel.setText("This is not a bug");
                month++;
                return;
            }
            if (month == 17) {
                monthLabel.setText("Almost there!");
                month++;
                return;
            }
            if (month == 18) {
                monthLabel.setText("Just a little bit!");
                month++;
            } else {
                newYear.setOpacity(1);
                monthLabel.setText("Happy New Year! :))");
                newYear.setDisable(false);
            }

        }
    }

    @FXML
    private void printReport() throws IOException {
        ReportWrite.printReportWrite(ron95IV, ron95III, e5);
        ReportRead.printReportRead();
        plotButton.setDisable(false);
    }

    @FXML
    private void plot() throws IOException {
        Parent graph = FXMLLoader.load(getClass().getResource("plot.fxml"));
        Stage chart = new Stage();
        chart.setTitle("Gas Station Chart");
        chart.setScene(new Scene(graph));
        chart.initModality(Modality.APPLICATION_MODAL);
        chart.showAndWait();
    }

    @FXML
    private void aboutHandle() throws IOException {
        Parent about = FXMLLoader.load(getClass().getResource("about.fxml"));
        Stage help = new Stage();
        help.setTitle("About");
        help.setScene(new Scene(about));
        help.initModality(Modality.APPLICATION_MODAL);
        help.setResizable(false);
        help.showAndWait();
    }

    private double calFund(Ron95IV fuel1, Ron95III fuel2, E5 fuel3) {
        return Double.parseDouble(df2.format(fuel1.getFund() + fuel2.getFund() + fuel3.getFund()));
    }

    private double calInterest(Ron95IV fuel1, Ron95III fuel2, E5 fuel3) {
        return Double.parseDouble(df2.format(fuel1.calInterest() + fuel2.calInterest() + fuel3.calInterest()));
    }

    private boolean submitEvent() {
        double ron95IV_gallon, ron95III_gallon, e5_gallon;
        try {
            ron95IV_gallon = Double.parseDouble(Ron95IV.getText());
            ron95III_gallon = Double.parseDouble(Ron95III.getText());
            e5_gallon = Double.parseDouble(E5.getText());
        } catch (NumberFormatException e ) {
            System.err.println("You typed in String data or you didn't type in anything! \n \n");
            return false;
        }
        ron95IV[month] = new Ron95IV(18.6, 0.11, ron95IV_gallon, 0);
        ron95III[month] = new Ron95III(18, 0.1, ron95III_gallon, 0);
        e5[month] = new E5(15, 0.08, e5_gallon, 0);
        ron95IV[month].setFund(ron95IV[month].calFund());
        ron95III[month].setFund(ron95III[month].calFund());
        e5[month].setFund(e5[month].calFund());
        return true;
    }

}


