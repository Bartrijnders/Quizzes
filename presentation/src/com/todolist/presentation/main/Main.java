package com.todolist.presentation.main;

import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;
import com.todolist.logic.todolistlogic.ToDoListLoader;
import com.todolist.logic.todolistlogic.ToDoListSaver;

public class Main {

    public static void main(String[] args) {
        IToDoList list = ToDoListLoader.load();

        for (ITask task : list.getItems()) {
            System.out.println(task.toString());
        }

        ToDoListSaver.save(list);

    }
}
