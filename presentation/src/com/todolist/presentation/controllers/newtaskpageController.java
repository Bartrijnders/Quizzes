package com.todolist.presentation.controllers;

import com.todolist.domain.factorys.TaskFactory;
import com.todolist.domain.interfaces.ITask;
import com.todolist.logic.todolistlogic.LocalDateToDateConV;
import com.todolist.logic.todolistlogic.ToDoListSaver;
import com.todolist.presentation.eventHandlers.newtaskpage.CancelButtonEvent;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.text.StyledEditorKit;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;

public class newtaskpageController implements Initializable {

    static ITask answer;

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
       close();
    }

    @FXML
    public void handleConfirmButtonAction(ActionEvent event){
        if(titleTextField.getText().isEmpty() || datePicker.getValue() == null){
            System.out.println("please enter all required information");
        }
        else{
            answer = TaskFactory.create(titleTextField.getText(), LocalDateToDateConV.convertToDate(datePicker.getValue()));
            close();
        }
    }

    public ITask getAnswer(){
        return answer;
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
        confirmButton.setOnAction(e -> handleConfirmButtonAction(e));
    }

    public void close(){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }


}
