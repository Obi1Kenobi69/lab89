package com.example.prog2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
      Label label = new Label("Hello");
      Button button = new Button("Button");
      Group group = new Group(button);
      FlowPane root = new FlowPane(label,group);
      Scene scene = new Scene(root,300,150);
      stage.setScene(scene);
      stage.setTitle("Hello JavaFX");
      stage.show();
    }

}