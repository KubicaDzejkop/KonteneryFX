package pl.gornik.kontenery;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class AccordionController implements Initializable {

    @FXML
    private ColorPicker colorPick;

    @FXML
    private Rectangle rectangle1;

    @FXML
    private Rectangle rectangle2;

    @FXML
    private Label lblInfo;

    @FXML
    private Button btnButton;

    @FXML
    private Button btnClose;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    btnClose.setOnAction(event -> Platform.exit());
    colorPick.setOnAction(event -> {
        Color color = colorPick.getValue();
        rectangle1.setFill(color);
        lblInfo.setTextFill(color);
        Color color1 = color.invert();
        btnButton.setTextFill(color1);
        rectangle2.setFill(color1);
    });
    }
}
