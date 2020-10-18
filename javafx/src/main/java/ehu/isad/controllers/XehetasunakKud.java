package ehu.isad.controllers;

import ehu.isad.Book;
import ehu.isad.Liburuak;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class XehetasunakKud implements Initializable {

    private Liburuak mainApp;

    @FXML
    private Label lblIzenburua;


    @FXML
    private Label lblArgitaletxea;

    @FXML
    private Label lblOrriKop;

    @FXML
    private Button btnAtzera;

    @FXML
    public void onClick(ActionEvent actionEvent) throws IOException {
        mainApp.mainErakutsi();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void putInfo(Book b) throws IOException {
        lblIzenburua.setText(b.getDetails().getTitle());
        lblOrriKop.setText(Integer.toString(b.getDetails().getNumber_of_pages()));
        lblArgitaletxea.setText(b.getDetails().getPublishers()[0]);
    }

    public void setMainApp(Liburuak main) {
        this.mainApp = main;
    }
}

