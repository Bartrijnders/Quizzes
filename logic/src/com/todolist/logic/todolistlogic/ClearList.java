package com.todolist.logic.todolistlogic;

import com.todolist.domain.factorys.ToDoListFactory;
import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.ILabel;
import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;

public class ClearList {
    public static IToDoList clear(IToDoList list){
        IToDoList output = list;

        while(list.getItems().remove(null));
        while(list.getFolders().remove(null));
        ToDoListSaver.save(list);
        return output;
    }

}
