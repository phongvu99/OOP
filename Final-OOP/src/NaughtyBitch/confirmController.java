package NaughtyBitch;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class confirmController {

    @FXML
    private Button yes;

    @FXML
    private Button no;

    @FXML
    private void noEvent(ActionEvent event) {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();
    }

    @FXML
    private void yesEvent(ActionEvent event) {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();
        Platform.exit();
    }


}

