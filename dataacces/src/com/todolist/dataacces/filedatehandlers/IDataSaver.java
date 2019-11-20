package com.todolist.dataacces.filedatehandlers;


import com.todolist.domain.interfaces.IToDoList;

public interface IDataSaver {
    void save(IToDoList toDoList);
}
