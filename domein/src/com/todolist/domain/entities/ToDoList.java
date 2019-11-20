package com.todolist.domain.entities;

import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ToDoList implements IToDoList, Serializable {
    private List<ITask> items;
    private List<IFolder> folders;

    public ToDoList() {
        items = new ArrayList<>();
        folders = new ArrayList<>();
    }

    @Override
    public List<ITask> getItems() {
        return items;
    }

    @Override
    public void setItems(List<ITask> items) {
        this.items = items;
    }

    @Override
    public List<IFolder> getFolders() {
        return folders;
    }

    @Override
    public void setFolders(List<IFolder> folders) {
        this.folders = folders;
    }
}
