package com.todolist.presentation.main;

import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;
import com.todolist.logic.printers.TaskPrinter;
import com.todolist.logic.todolistlogic.ToDoListLoader;
import com.todolist.logic.todolistlogic.ToDoListSaver;

public class Main {

    public static void main(String[] args) {
        IToDoList list = ToDoListLoader.load();


        TaskPrinter tp = new TaskPrinter();
        for (ITask task : list.getItems()) {
            tp.print(task);
        }

        ToDoListSaver.save(list);

    }
}
