package com.example.program3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root,400,150, Color.PURPLE);
        scene.setFill(Color.PURPLE);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}