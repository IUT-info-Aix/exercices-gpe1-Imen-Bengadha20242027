package fr.amu.iut.exercice7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {

    private int counter = 0;

    @FXML
    private Label counterLabel;

    @FXML
    public void increment() {
        counter++;
        counterLabel.setText(String.valueOf(counter));
    }

    @FXML
    public void decrement() {
        counter--;
        counterLabel.setText(String.valueOf(counter));
    }
}
