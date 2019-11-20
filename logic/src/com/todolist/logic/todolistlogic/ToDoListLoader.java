package com.todolist.logic.todolistlogic;

import com.todolist.dataacces.filedatehandlers.FileDataLoader;
import com.todolist.dataacces.filedatehandlers.IDataLoader;
import com.todolist.domain.interfaces.IToDoList;

public class ToDoListLoader {
    public static IToDoList load() {
        IDataLoader loader = new FileDataLoader();
        return loader.load();
    }
}
