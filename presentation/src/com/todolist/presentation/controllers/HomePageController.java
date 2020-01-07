package com.todolist.presentation.controllers;

import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;
import com.todolist.logic.todolistlogic.*;
import com.todolist.presentation.components.TaskComponent;
import com.todolist.presentation.eventHandlers.homepage.NewFolderButtonEvent;
import com.todolist.presentation.eventHandlers.homepage.NewTaskButtonEvent;
import com.todolist.presentation.main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();


    @FXML
    private TreeView<String> contentTreeview;
    @FXML
    private DatePicker datePicker;
    @FXML
    private VBox viewVbox;
    @FXML
    private Button newTaskButton;
    @FXML
    private Button newFolderButton;
    @FXML
    private Button newLabelButton;
    @FXML
    private AnchorPane anchorPane;

    private IToDoList list;

    private ITask task;

    private IFolder folder;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list = ToDoListLoader.load();
        fillInData();
        ClearList.clear(list);
        shapeVbox();
        getTreeviewContent();
        getItems(LocalDateToDateConV.convertToDate(datePicker.getValue()));
        newTaskButton.setOnAction(e -> handleNewButton(e));
        newFolderButton.setOnAction(e -> handleNewFolderButton(e));
        datePicker.valueProperty().addListener((observable, oldValue, newValue) -> getItems(LocalDateToDateConV.convertToDate(newValue)));
        Main.getPs().setOnCloseRequest(e->ToDoListSaver.save(list));
    }

    public void shapeVbox(){
        viewVbox.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        viewVbox.setFillWidth(true);
    }

    public void fillInData(){
        datePicker.setValue(LocalDate.now());
    }

    public void getItems(Date date){
        TaskGetterDate taskGetterDate = new TaskGetterDate();
        ArrayList<ITask> worklist = taskGetterDate.getTaskByDate(list, date);
        viewVbox.getChildren().clear();
        if(!worklist.isEmpty())
        for(ITask task : worklist){
            TaskComponent taskComponent = new TaskComponent(task);
            viewVbox.getChildren().addAll(taskComponent.getLayout());
        }
    }

    public void getTreeviewContent(){
        //root branch
        contentTreeview.setRoot(null);
        TreeItem<String> root;
        root = new TreeItem<>("Folders");
        root.setExpanded(true);
        contentTreeview.setRoot(root);

        //folders branch
        if(!list.getFolders().isEmpty()){
            for(IFolder folder : list.getFolders()){
                    TreeItem<String> treeItem = new TreeItem<>(folder.getTitle());
                    root.getChildren().add(treeItem);
            }
        }

    }

    public TreeItem<String> makeBranch(String name, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(name);
        parent.getChildren().add(item);
        return item;
    }

    public void handleNewButton(ActionEvent e){
        NewTaskButtonEvent newTaskButtonEvent = new NewTaskButtonEvent();
        task = newTaskButtonEvent.handleClick(e);
        if(task != null){
            list.getItems().add(task);
            ToDoListSaver.save(list);
            getItems(LocalDateToDateConV.convertToDate(datePicker.getValue()));
        }

    }

    public void onClose(){
        ToDoListSaver.save(list);
    }

    public void handleNewFolderButton(ActionEvent e){
        NewFolderButtonEvent newfolderbuttonevent = new NewFolderButtonEvent();
        folder = newfolderbuttonevent.handleClick(e, list);
        if (folder != null) {
            list.getFolders().add(folder);
            ToDoListSaver.save(list);
            getTreeviewContent();
        }

    }



}
