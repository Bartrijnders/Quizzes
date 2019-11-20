package com.todolist.logic.todolistlogic;

import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.IToDoList;

public class FolderAdder {
    public static void add(IToDoList toDoList, IFolder folder) {
        toDoList.getFolders().add(folder);
    }
}
