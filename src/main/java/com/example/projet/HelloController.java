package com.example.projet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public abstract class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField decimal;

    @FXML
    private TextField binary;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Decimal to Binary
        decimal.setOnAction(btnaction -> {
            String binar = "";

            for(int numb = 0; numb < Binary.binaryNum(parseInt(decimal.getText()),parseInt(decimal.getText()),parseInt(decimal.getText())).size(); numb++ ) {
                binar = binar + String.valueOf(Binary.binaryNum(parseInt(decimal.getText()), parseInt(decimal.getText()), parseInt(decimal.getText())).get(numb));
            }
            binary.setText(binar);
        });

        //Binary to Decimal
        binary.setOnAction(btnaction -> {
            decimal.setText(String.valueOf(Integer.parseInt(binary.getText(),2)));
        });

        //Roman number to Decimal
        decimal.setOnAction(btnaction -> {
            //roman.setText(Roman.romanNumber(parseInt(decimal.getText())));
        });
    }
}