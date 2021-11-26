package com.example.projet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        title.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));

        author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));

        resume.setCellValueFactory(new PropertyValueFactory<Book, String>("resume"));

        column.setCellValueFactory(new PropertyValueFactory<Book, Integer>("column"));

        row.setCellValueFactory(new PropertyValueFactory<Book, Integer>("row"));

        publication.setCellValueFactory(new PropertyValueFactory<Book, Integer>("publication"));

        tableView.setItems(getBook());
    }

    public ObservableList<Book> getBook(){

        ObservableList<Book> book = FXCollections.observableArrayList();

        book.add(new Book("Harry Potter", "J.K Rowling",
                "World of sorcery",5, 6,  1997));
        return book;
    }
}