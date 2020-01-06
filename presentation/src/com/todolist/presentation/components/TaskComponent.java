package com.todolist.presentation.components;

import com.todolist.domain.interfaces.ITask;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class TaskComponent extends Node {

    private GridPane layout;
    private Label taskTitleLabel;
    private CheckBox checkBox;
    private ITask task;

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
    }

    public GridPane getLayout() {
        return layout;
    }

    private void createLayout(){
        layout = new GridPane();
        RowConstraints row1 = new RowConstraints();
        row1.setVgrow(Priority.ALWAYS);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.ALWAYS);
        System.out.println(parentProperty().toString());
        layout.getColumnConstraints().add(col1);

    }
}
