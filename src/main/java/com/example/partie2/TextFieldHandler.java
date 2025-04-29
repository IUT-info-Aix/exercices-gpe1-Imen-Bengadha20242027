package com.example.partie2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextFieldHandler implements EventHandler<ActionEvent> {

    private Label helloLabel;
    private TextField nameField;

    public TextFieldHandler(Label helloLabel, TextField nameField) {
        this.helloLabel = helloLabel;
        this.nameField = nameField;
    }

    @Override
    public void handle(ActionEvent event) {
        helloLabel.setText("Bonjour à toi, " + nameField.getText());
    }
}
