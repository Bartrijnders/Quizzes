package com.todolist.presentation.controllers;

import com.todolist.presentation.eventHandlers.newtaskpage.CancelButtonEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class newtaskpageController implements Initializable {

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField titleTextField;

    @FXML
    private Button cancelButton;

    @FXML
    private Button confirmButton;

    @FXML
    private AnchorPane anchorPane;


    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleConfirmButtonAction(ActionEvent event){
        if(titleTextField.getText().isEmpty() || datePicker.getValue() == null){

        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initComponents();
    }

    public void initComponents(){
        cancelButton.setOnAction(e -> {
            handleCloseButtonAction(e);
        });
        datePicker.setValue(LocalDate.now());
        titleTextField.setPromptText("Vul hier uw titel in");
    }


}
