package cz.spsmb.javafx.calculator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private TextField text;

    @FXML
    protected void onConvertClick() {
        String texty = text.getText();
        double num = Double.parseDouble(texty);
        switch (input.selectionModelProperty().get().getSelectedItem()){
            case("cm")->{
                num = num/100;
            }
            case("dm")->{
                num = num/10;
            }
        }
        switch (input2.selectionModelProperty().get().getSelectedItem()){
            case("cm")->{
                num = num*100;
            }
            case("dm")->{
                num = num*10;
            }
        }
        text.setText(String.valueOf(num));
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