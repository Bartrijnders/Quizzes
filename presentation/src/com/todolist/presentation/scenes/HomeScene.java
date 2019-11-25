package com.todolist.presentation.scenes;

import com.todolist.domain.interfaces.IToDoList;
import javafx.scene.layout.BorderPane;

public class HomeScene {

    private final int width = 600;
    private final int heigth = 400;
    private BorderPane borderPane;
    private IToDoList list;

    public HomeScene(IToDoList list) {
        borderPane = new BorderPane();
        this.list = list;
    }

    public IToDoList getList() {
        return list;
    }
}
