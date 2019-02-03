package NaughtyBitch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class dancingController {

    private String location = "# set your path here # \\video.mp4";
    private Media media = new Media(new File(location).toURI().toString());
    private MediaPlayer player = new MediaPlayer(media);

    @FXML
    private MediaView mediaView;

    @FXML
    private Button playButton;

    @FXML
    private void playVideo(ActionEvent e) {
        playButton.setOpacity(0);
        playButton.setDisable(true);
        Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
        window.setTitle("NO PASSWORD FOR YOU!");
        window.setOnCloseRequest(event -> player.stop());
        mediaView.setMediaPlayer(player);
        player.play();
    }
}


