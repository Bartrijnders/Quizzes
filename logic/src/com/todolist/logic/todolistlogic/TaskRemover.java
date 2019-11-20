package com.todolist.logic.todolistlogic;

import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;

public class TaskRemover {
    public static void remove(IToDoList toDoList, ITask task) {
        toDoList.getItems().remove(task);
    }
}
