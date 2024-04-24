package pl.gornik.kontenery;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class TabController implements Initializable {

    @FXML
    private Tab tab1;

    @FXML
    private RadioButton rioPyt11;

    @FXML
    private ToggleGroup pyt1;

    @FXML
    private RadioButton rioPyt12;

    @FXML
    private RadioButton rioPyt13;

    @FXML
    private RadioButton rioPyt14;

    @FXML
    private Button btnConfirm1;

    @FXML
    private Tab tab2;

    @FXML
    private RadioButton rioPyt21;

    @FXML
    private ToggleGroup pyt2;

    @FXML
    private RadioButton rioPyt22;

    @FXML
    private RadioButton rioPyt23;

    @FXML
    private RadioButton rioPyt24;

    @FXML
    private Button btnConfirm2;

    @FXML
    private Tab tabResult;

    @FXML
    private Label lblResult;

    @FXML
    private Button btnClose;

    public static int counter = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnClose.setOnAction(event -> Platform.exit());

        btnConfirm1.setOnAction(event -> {
            if(rioPyt13.isSelected()) counter++;
            tab1.setDisable(true);
            tab2.setDisable(false);

        });

        btnConfirm2.setOnAction(event -> {
            if(rioPyt21.isSelected()) counter++;
            tab2.setDisable(true);
            tabResult.setDisable(false);
            lblResult.setText("Zdobyłeś " + counter + " punktów");

        });
    }
    public void checkAnswer(RadioButton radioCorrect){
        if (radioCorrect.isSelected()){
            counter++;
        }
    }
}
