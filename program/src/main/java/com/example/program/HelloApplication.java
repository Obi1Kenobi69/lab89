package com.example.program;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application

    }

    public static void main(String[] args)launch();
    public class Main extends Application {
     public static GridPane initRootLayout () {
     GridPane root = new GridPane();
     root.setAlignment(Pos.CENTER)
     root.setHgap(10);
     root.setVgap(10);
     root.setPadding(new Insets(25));

     Text scenetitle  = new Text("Calculation of age");
     Font  fontBig = Font.font("Tahoma", FontWeight.NORMAL, 26);
     scenetitle.setFont(fontBig);

     root.add(scenetitle, 0, 0, 2, 1);

     Label userName = new Label( "Name:");
     userName. setFont(fontBig);
     root. add(userName, 0, 1);

     TextField nameTexField = new TextField();
     nameTexField. setFont(fontBig);
     root.add(nameTexField, 1, 1);

     Label userYear = new Label("Year:");
     userYear.setFont(fontBig);
     root.add(userYear, 1, 2);

     Text resoult = new Text("Resoult");
     resoult.setFont(fontBig);
     root.add(resoult, 0, 6);

     Button btn = new Button("OK");
     btn.setFont(fontBig);
     btn.setOnAction(Event::consume);
