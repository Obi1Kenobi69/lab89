package com.example.demo14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import  java.util.Date;

import java.util.Scanner;
public class HelloApplication extends Application {

    public static GridPane initRootLayout() {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25));

        Text scenetitle = new Text("Calculation of calorie");

        Font fontBig = Font.font("Tahoma", FontWeight.NORMAL, 26);

        scenetitle.setFont(fontBig);

        root.add(scenetitle, 0, 0, 2, 1);

        Label userName1 = new Label("List of product: Sausage, Turkey, Omelet, Waffles, boiled, Cucumber");
        userName1.setFont(fontBig);
        root.add(userName1, 0, 1);

        Label userName = new Label("Product:");
        userName.setFont(fontBig);
        root.add(userName, 0, 2);

    TextField nameTextField = new TextField();
        nameTextField.setFont(fontBig);
        root.add(nameTextField, 1, 2);

        Label userYear = new Label("Weight:");
        userYear.setFont(fontBig);
        root.add(userYear, 0, 3);

        TextField valueYear = new TextField();
        valueYear.setFont(fontBig);
        root.add(valueYear, 1, 3);

        Text resoult = new Text("Caloric calculation");
        resoult.setFont(fontBig);
        root.add(resoult, 0 , 6);

        Button btn = new Button("OK");
        btn.setFont(fontBig);
        btn.setOnAction(event -> {

           String weightOfProduct = valueYear.getText();

                   if(weightOfProduct.matches("[0-9]+")) {
                       int w = Integer.parseInt(weightOfProduct);
                       int Sausage = 301 * w/ 100;

                resoult.setText(nameTextField.getText() + " is " + Sausage + " calories"); }

            if(weightOfProduct.matches("[0-9]+")) {
                int w = Integer.parseInt(weightOfProduct);
                int Turkey = 198 * w / 100;

                resoult.setText(nameTextField.getText() + " is " + Turkey + " calories"); }

            if(weightOfProduct.matches("[0-9]+")) {
                int w = Integer.parseInt(weightOfProduct);
                int Omelet = 209 * w/ 100;

                resoult.setText(nameTextField.getText() + " is " + Omelet + " calories"); }

            if(weightOfProduct.matches("[0-9]+")) {
                int w = Integer.parseInt(weightOfProduct);
                int Waffles = 543 * w/ 100;

                resoult.setText(nameTextField.getText() + " is " + Waffles + " calories"); }

            if(weightOfProduct.matches("[0-9]+")) {
                int w = Integer.parseInt(weightOfProduct);
                int boiled  = 301 * w/ 100;

                resoult.setText(nameTextField.getText() + " is " + boiled  + " calories"); }

            if(weightOfProduct.matches("[0-9]+")) {
                int w = Integer.parseInt(weightOfProduct);
                int Cucumber = 13 * w/ 100;
                resoult.setText(nameTextField.getText() + " is " + boi  + " calories"); }

            if(weightOfProduct.matches("[0-9]+")) {
                int w = Integer.parseInt(weightOfProduct);
                int Cucumber = 13 * w/ 100;


                resoult.setText(nameTextField.getText() + " is " + Cucumber + " calories"); }

                   else {
                resoult.setFill(Color.FIREBRICK);
                resoult.setText("Error");

            }
        });

        root.add(btn, 1, 5);

        return root;
    }

    @Override

    public void start (Stage primaryStage) {
        GridPane root = initRootLayout();
        Scene scene = new Scene(root, 1300, 500);

        primaryStage.setTitle("Calories counter");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}