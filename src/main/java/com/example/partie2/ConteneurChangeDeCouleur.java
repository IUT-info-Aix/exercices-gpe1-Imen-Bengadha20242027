package com.example.partie2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class ConteneurChangeDeCouleur extends Application {

    @Override
    public void start(Stage stage) {
        // Création du BorderPane
        BorderPane borderPane = new BorderPane();

        // Création du Label centré en haut
        Label label = new Label("Cliquez sur un bouton pour changer la couleur");
        borderPane.setTop(label);

        // Création du Pane au centre
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: white;"); // couleur initiale du centre
        borderPane.setCenter(pane);

        // Création de la HBox pour les boutons
        HBox hbox = new HBox(17); // 10 est l'espacement entre les boutons
        hbox.setAlignment(Pos.CENTER); // Centrer les boutons
        Button buttonVert = new Button("Vert");
        Button buttonRouge = new Button("Rouge");
        Button buttonBleu = new Button("Bleu");

        // Ajout des boutons à la HBox
        hbox.getChildren().addAll(buttonVert, buttonRouge, buttonBleu);
        borderPane.setBottom(hbox);

        // Gestionnaires d'événements pour chaque bouton
        buttonVert.setOnAction(evenement -> {
            // Action au clic sur le bouton Vert
            pane.setStyle("-fx-background-color: #2adecb;");
        });

        buttonRouge.setOnAction(evenement -> {
            // Action au clic sur le bouton Rouge
            pane.setStyle("-fx-background-color: red;");
        });

        buttonBleu.setOnAction(evenement -> {
            // Action au clic sur le bouton Bleu
            pane.setStyle("-fx-background-color: blue;");
        });

        // Création de la scène
        Scene scene = new Scene(borderPane, 400, 200);

        // Configuration de la fenêtre
        stage.setTitle("Changer la couleur du centre");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
