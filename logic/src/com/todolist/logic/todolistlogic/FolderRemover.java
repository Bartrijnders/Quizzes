package com.todolist.logic.todolistlogic;

import com.todolist.domain.interfaces.IFolder;
import com.todolist.domain.interfaces.IToDoList;

public class FolderRemover {
    public static void remove(IToDoList toDoList, IFolder folder) {
        toDoList.getFolders().remove(folder);
    }
}
