package com.example.partie2;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ButtonClickHandler implements EventHandler<MouseEvent> {

    private Label helloLabel;
    private TextField nameField;

    public ButtonClickHandler(Label helloLabel, TextField nameField) {
        this.helloLabel = helloLabel;
        this.nameField = nameField;
    }

    @Override
    public void handle(MouseEvent event) {
        helloLabel.setText("Bonjour à toi, " + nameField.getText());
    }
}
