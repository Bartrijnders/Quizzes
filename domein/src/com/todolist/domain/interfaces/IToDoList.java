package com.todolist.domain.interfaces;

import java.util.List;

public interface IToDoList {

    List<ITask> getItems();

    void setItems(List<ITask> items);

    List<IFolder> getFolders();

    void setFolders(List<IFolder> folders);

}
