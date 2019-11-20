package com.todolist.logic.todolistlogic;

import com.todolist.dataacces.filedatehandlers.FileDataSaver;
import com.todolist.dataacces.filedatehandlers.IDataSaver;
import com.todolist.domain.interfaces.IToDoList;

public class ToDoListSaver {
    public static void save(IToDoList toDoList) {
        IDataSaver saver = new FileDataSaver();
        saver.save(toDoList);
    }
}
