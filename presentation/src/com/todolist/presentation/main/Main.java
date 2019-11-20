package com.todolist.presentation.main;

import com.todolist.domain.factorys.TaskFactory;
import com.todolist.domain.factorys.ToDoListFactory;
import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;
import com.todolist.logic.todolistlogic.TaskAdder;
import com.todolist.logic.todolistlogic.ToDoListSaver;

public class Main {

    public static void main(String[] args) {
        IToDoList list = ToDoListFactory.create("my list");

        for (int i = 0; i < 5; i++) {
            ITask t = TaskFactory.create("task " + i);
            TaskAdder.add(list, t);
            System.out.println(t.toString());
        }

        ToDoListSaver.save(list);

    }
}
