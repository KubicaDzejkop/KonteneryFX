package pl.gornik.kontenery;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AnchorController implements Initializable {

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClose;

    @FXML
    private TextField txtText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnClose.setOnAction(event -> Platform.exit());
        btnAdd.setOnAction(event ->{
            txtArea.setText(txtArea.getText() + "\n" + txtText.getText());
            txtText.clear();
            txtArea.requestFocus();
        });
    }
}
