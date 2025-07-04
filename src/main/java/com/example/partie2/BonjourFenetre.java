package com.example.partie2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

// Ajout des imports des deux gestionnaires
import com.example.partie2.ButtonClickHandler;
import com.example.partie2.TextFieldHandler;

public class BonjourFenetre extends Application {

    private Label helloLabel;
    private TextField nameField;
    private Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);


        // Ajout d'un bouton avec du vert
        Button button = new Button("Vert");
        vbox.getChildren().add( button );
        // Ajout d'un bouton avec du texte
       // Button button = new Button("Rouge");
       // vbox.getChildren().add( button );// Ajout d'un bouton avec du texte
        //        Button button = new Button("Dire bonjour");
        //        vbox.getChildren().add( button );
        // Ajout d'un bouton avec du texte
       // Button button = new Button("Bleu");
       // vbox.getChildren().add( button );

        // Clic sur le bouton — utilise ButtonClickHandler (MouseEvent)
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickHandler(helloLabel, nameField));

        // Scène
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello application");
        primaryStage.show();
    }
}
