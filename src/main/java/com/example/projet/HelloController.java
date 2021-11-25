package com.example.projet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public abstract class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField deci;

    @FXML
    private TextField binary;

    @FXML
    private TextField roman;

    @FXML
    private Button btnNew;

    @FXML
    private AnchorPane globalBiblio;

    @FXML
    private AnchorPane globalStats;

    @FXML
    private VBox VboxStats;

    @FXML
    private Button btnMenu;

    @FXML
    private VBox VboxTable;

    @FXML
    private VBox VboxBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        globalStats.getChildren().removeAll(VboxStats);
        btnNew.setOnMouseClicked(btnMeteo -> {
            globalStats.getChildren().addAll(VboxStats);
        });

        //Decimal to Binary
        deci.setOnAction(btnaction -> {
            String binar = "";

            for(int numb = 0; numb < Binary.binaryNum(parseInt(deci.getText()),parseInt(deci.getText()),parseInt(deci.getText())).size(); numb++ ) {
                binar = binar + String.valueOf(Binary.binaryNum(parseInt(deci.getText()), parseInt(deci.getText()), parseInt(deci.getText())).get(numb));
            }
            binary.setText(binar);
        });

        //Binary to Decimal
        binary.setOnAction(btnaction -> {
            deci.setText(String.valueOf(Integer.parseInt(binary.getText(),2)));
        });

        //Roman number to Decimal
        deci.setOnAction(btnaction -> {
            //roman.setText(Roman.romanNumber(parseInt(decimal.getText())));
        });
    }
}