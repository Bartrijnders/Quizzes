package com.todolist.logic.todolistlogic;

import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskGetterDate {
    public ArrayList<ITask> getTaskByDate(IToDoList list, Date date){
        ArrayList<ITask> output = new ArrayList();
        for(ITask task : list.getItems()){
            if(task.getDateOfCreation() == date){
                output.add(task);
            }
        }
        return output;
    }
}
