package NaughtyBitch;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class aboutController {

    @FXML
    private ImageView javaWebsite;

    @FXML
    private void handleEvent() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://go.java/index.html?intcmp=gojava-banner-java-com"));
    }
}
