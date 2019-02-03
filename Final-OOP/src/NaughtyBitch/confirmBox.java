package NaughtyBitch;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class confirmBox {

    private static Scene scene;

    protected static void confirm(Parent closeBox) {
        if (scene == null) scene = new Scene(closeBox);
        Stage window = new Stage();
        window.setTitle("Are you sure you want to exit?");
        window.setScene(scene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }
}
