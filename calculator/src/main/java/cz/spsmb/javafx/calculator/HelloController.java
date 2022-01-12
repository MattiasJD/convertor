package cz.spsmb.javafx.calculator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<String> input;

    @FXML
    private ComboBox<String> input2;

    @FXML
    private Button button1;

    @FXML
    protected void onConvertClick() {
        switch (input.selectionModelProperty().get().getSelectedItem()){

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        input.getItems().add("cm");
        input.getItems().add("dm");
        input.getItems().add("m");
        input2.getItems().add("cm");
        input2.getItems().add("dm");
        input2.getItems().add("m");
    }
}