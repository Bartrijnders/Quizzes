package com.todolist.presentation.controllers;

import com.todolist.domain.factorys.FolderFactory;
import com.todolist.domain.interfaces.IFolder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class newfolderpageController implements Initializable {

    private IFolder answer;
    @FXML
    private TextField titleTextField;

    @FXML
    private Button cancelButton;

    @FXML
    private Button confirmButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cancelButton.setOnAction(e -> close());
        confirmButton.setOnAction(e -> confirmEvent());

    }

    public void close(){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public IFolder getAnswer(){
        return answer;
    }

    public void confirmEvent(){
        if(titleTextField.getText().isEmpty()){

        }
        else{
            answer = FolderFactory.create(titleTextField.getText());
            close();
        }
    }
}
