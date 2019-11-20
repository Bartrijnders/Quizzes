package com.todolist.domain.factorys;

import com.todolist.domain.entities.Task;
import com.todolist.domain.interfaces.ITask;

public class TaskFactory {
    public static ITask create(String name) {
        return new Task(name);
    }
}
