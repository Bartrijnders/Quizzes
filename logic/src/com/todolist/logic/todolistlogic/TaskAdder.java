package com.todolist.logic.todolistlogic;

import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;

public class TaskAdder {
    public static void add(IToDoList todolist, ITask task) {
        todolist.getItems().add(task);
    }
}
