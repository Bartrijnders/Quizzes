package com.todolist.presentation.components;

import com.todolist.domain.interfaces.ITask;
import com.todolist.presentation.eventHandlers.TaskEvents;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class TaskComponent extends Node {

    private GridPane layout;
    private Label taskTitleLabel;
    private CheckBox checkBox;
    private ITask task;
    private ContextMenu contextMenu;
    private MenuItem editMenuItem;


    public TaskComponent(ITask task) {
        this.task = task;
        taskTitleLabel = new Label(task.getTitle());
        checkBox = new CheckBox();
        if(task.isChecked()){
            checkBox.setSelected(true);
        }
        createLayout();
        layout.add(taskTitleLabel,0,1,1,1);
        layout.add(checkBox,1,1,1,1);
        contextMenu = new ContextMenu();
        editMenuItem = new MenuItem("Edit");
        contextMenu.getItems().add(editMenuItem);
    }

    public GridPane getLayout() {
        return layout;
    }

    private void createLayout(){
        layout = new GridPane();
        layout.setGridLinesVisible(false);
        RowConstraints row1 = new RowConstraints();
        row1.setVgrow(Priority.ALWAYS);
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.ALWAYS);
        System.out.println(parentProperty().toString());
        layout.getColumnConstraints().add(col1);
        addRightCLickEvent();

    }

    public void addRightCLickEvent(){
        layout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton() == MouseButton.SECONDARY){
                    TaskEvents taskEvents = new TaskEvents();
                    taskEvents.rightClick();
                    contextMenu.show(layout, event.getScreenX(), event.getScreenY());
                }
            }
        });
    }
}
