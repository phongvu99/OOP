package NaughtyBitch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Parent closeBox = FXMLLoader.load(getClass().getResource("confirm.fxml"));
        stage.setTitle("Project Eden Demo");
        stage.setScene(new Scene(root));
        stage.show();
        stage.setOnCloseRequest(e -> {
            e.consume();
            confirmBox.confirm(closeBox);
        });
        stage.setResizable(false);
    }
}

