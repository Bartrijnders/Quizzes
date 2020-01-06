package com.todolist.presentation.controllers;

import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;
import com.todolist.logic.todolistlogic.TaskGetterDate;
import com.todolist.logic.todolistlogic.ToDoListLoader;
import com.todolist.logic.todolistlogic.ToDoListSaver;
import com.todolist.presentation.components.TaskComponent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

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
    private Button newButton;

    private IToDoList list;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list = ToDoListLoader.load();
        fillInData();
        shapeVbox();
        newButton.setOnAction(e -> newButtonAction());
        getTreeviewContent();
        getItems();
        ToDoListSaver.save(list);
    }

    public void shapeVbox(){
        viewVbox.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        viewVbox.setFillWidth(true);
    }

    public void fillInData(){
        datePicker.setValue(LocalDate.now());
    }

    public void getItems(){
        TaskGetterDate taskGetterDate = new TaskGetterDate();
        ArrayList<ITask> worklist = taskGetterDate.getTaskByDate(list, date);
        for(ITask task : worklist){
            TaskComponent taskComponent = new TaskComponent(task);
            viewVbox.getChildren().addAll(taskComponent.getLayout());
        }
    }

    public void getTreeviewContent(){

        //root branch
        TreeItem<String> root;
        root = new TreeItem<>("Folders");
        root.setExpanded(true);
        contentTreeview.setRoot(root);


        //folders branch
            for(IFolder folder: list.getFolders()){
                makeBranch(folder.getTitle(), root);
            }
    }

    public TreeItem<String> makeBranch(String name, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(name);
        parent.getChildren().add(item);
        return item;
    }

    public void newButtonAction(){

    }
}
