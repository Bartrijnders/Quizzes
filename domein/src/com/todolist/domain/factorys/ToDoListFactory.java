package com.todolist.domain.factorys;

import com.todolist.domain.entities.ToDoList;
import com.todolist.domain.interfaces.IToDoList;

public class ToDoListFactory {
    public static IToDoList create() {
        return new ToDoList();
    }
}
