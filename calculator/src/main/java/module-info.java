module cz.spsmb.javafx.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.spsmb.javafx.calculator to javafx.fxml;
    exports cz.spsmb.javafx.calculator;
}