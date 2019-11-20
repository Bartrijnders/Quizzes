package com.todolist.logic.folderlogic;

import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.ITask;

public class TaskAdder {
    public static void add(IFolder folder, ITask task) {
        folder.getItems().add(task);
    }
}
