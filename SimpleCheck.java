package com.example.simplecheck;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.HBox;


public class SimpleCheck extends Application {

    public void start(Stage stage) {
        Label message = new Label("Simple Text");
        message.setTextFill(Color.LIGHTGRAY);
        message.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,20));

        Button helloButton = new Button("Say Hello");
        Button goodbyeButton = new Button("Exit");
        goodbyeButton.setPrefWidth(100);
        helloButton.setPrefWidth(100);
        BorderPane root = new BorderPane();

        helloButton.setOnAction(e -> {
            message.setTextFill(Color.DARKRED);
            message.setText("Hello Fellas!");
        } );
        goodbyeButton.setOnAction(e -> Platform.exit());
        HBox buttonBar = new HBox (10, helloButton, goodbyeButton);
        buttonBar.setStyle(" " +
                "-fx-padding: 12px; -fx-background-color: #F5F0F0FF");
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #e7e4e4");
        buttonBar.setAlignment(Pos.CENTER);
        root.setBottom(buttonBar);
        root.setCenter(message);
        root.setPrefWidth(500);
        root.setPrefHeight(200);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple FX Test");
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}