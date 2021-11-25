package com.example.projet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
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

        decimal.setOnAction(btnaction -> {
            decimal.setText(String.valueOf(parseInt(decimal.getText())));
        });
    }
}