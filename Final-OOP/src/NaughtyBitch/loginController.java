package NaughtyBitch;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class loginController {

    private String username, password;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField pwf;

    @FXML
    private Label lblMessage;

    @FXML
    private Button login;

    @FXML
    private Button forgot;

    @FXML
    private void check(Event event) throws IOException {
        getCredentials();
        Parent mainGUI = FXMLLoader.load(getClass().getResource("mainGUI.fxml"));
        Scene scene = new Scene(mainGUI);
        // This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if (txtUserName.getText().equals(username) && pwf.getText().equals(password)) {
            System.out.println("Scene changing...");
            window.setScene(scene);
            window.show();
        } else {
            lblMessage.setText("Login Failed");
            lblMessage.setTextFill(Color.RED);
        }
        txtUserName.clear(); // Clear username
        pwf.clear(); // Clear password
    }

    @FXML
    private void forgotPassword() throws IOException {
        Parent dance = FXMLLoader.load(getClass().getResource("dancing.fxml"));
        Stage dancing = new Stage();
        dancing.setScene(new Scene(dance));
        dancing.setTitle("Forgot Password?");
        dancing.initModality(Modality.APPLICATION_MODAL);
        dancing.setResizable(false);
        dancing.showAndWait();
    }

    @FXML
    private void handleEvent(KeyEvent e) throws IOException {
        if (e.getCode() == KeyCode.ENTER) check(e);
    }

    private void getCredentials() throws IOException {
        File myFile = new File("# set your path here # \\login.txt");
        Scanner fileInput = new Scanner(new FileReader(myFile));
        username = fileInput.nextLine();
        password = fileInput.nextLine();
    }


}

