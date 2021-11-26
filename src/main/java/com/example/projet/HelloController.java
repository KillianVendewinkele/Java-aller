package com.example.projet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class HelloController implements Initializable {

    @FXML
    private Button army;

    @FXML
    private TextField binary;

    @FXML
    private TextField deci;

    @FXML
    private TextField roman;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnsupp;

    @FXML
    private VBox add;

    @FXML
    private AnchorPane add1;

    @FXML
    private Button conversion;

    @FXML
    private Button library;

    @FXML
    private AnchorPane window;

    @FXML
    private AnchorPane window1;

    @FXML
    private AnchorPane window2;

    public HelloController(TextField deci) {
        this.deci = deci;
    }

    @FXML
    private TableColumn<Book, String> author;

    @FXML
    private TableColumn<Book, Integer> column;

    @FXML
    private TableColumn<Book, Integer> publication;

    @FXML
    private TableColumn<Book, String> resume;

    @FXML
    private TableColumn<Book, Integer> row;

    @FXML
    private TableView<Book> tableView;

    @FXML
    private TableColumn<Book, String> title;

    public ObservableList<Book> getBook(){

        ObservableList<Book> book = FXCollections.observableArrayList();

        book.add(new Book("Harry Potter", "J.K Rowling",
                "World of sorcery",5, 6,  1997));
        return book;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            add.getChildren().removeAll(add1);

            //Display or not the window "Library" with the button Library
            window.getChildren().removeAll(window1,window2);
            library.setOnMouseClicked(btnaction -> {
                window.getChildren().removeAll(window2);
                window.getChildren().addAll(window1);
            });

            //Display or not the window "Conversion" with the button Conversion
            conversion.setOnMouseClicked(btnaction -> {
                window.getChildren().removeAll(window1);
                window.getChildren().addAll(window2);
            });

            //Display or not the form with the new and delete button
            btnadd.setOnMouseClicked(btnaction -> {
                add.getChildren().addAll(add1);
            });
            btnsupp.setOnMouseClicked(btnaction -> {
                add.getChildren().addAll(add1);
            });

            //Decimal to Binary
            deci.setOnAction(btnaction -> {
                String binar = "";

                for(int numb = 0; numb < Binary.binaryNum(parseInt(deci.getText())).length(); numb++ ) {
                    binar = binar + Binary.binaryNum(parseInt(deci.getText()));
                }
                binary.setText(binar);
            });

            //Binary to Decimal
            binary.setOnAction(btnaction -> {
                deci.setText(String.valueOf(Integer.parseInt(binary.getText(),2)));
            });

            //Roman number to Decimal
            deci.setOnAction(btnaction -> {
                roman.setText(Roman.romanNumber(parseInt(deci.getText())));
            });

            title.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));

            author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));

            resume.setCellValueFactory(new PropertyValueFactory<Book, String>("resume"));

            column.setCellValueFactory(new PropertyValueFactory<Book, Integer>("column"));

            row.setCellValueFactory(new PropertyValueFactory<Book, Integer>("row"));

            publication.setCellValueFactory(new PropertyValueFactory<Book, Integer>("publication"));

            tableView.setItems(getBook());
        }

        catch(Exception e){
            System.out.println("Tous les éléments de Scene Builder valent null");
        }
    }
}