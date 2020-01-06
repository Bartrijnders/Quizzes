package com.todolist.logic.todolistlogic;

import com.todolist.domain.interfaces.ITask;
import com.todolist.domain.interfaces.IToDoList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskGetterDate {
    public ArrayList<ITask> getTaskByDate(IToDoList list, Date date){
        try{
            ArrayList<ITask> output = new ArrayList();
            date = DateFormatter.format(date);
            for(ITask task : list.getItems()){
                if(task != null){
                    Date taskdate = DateFormatter.format(task.getDateOfCreation());
                    if(taskdate.compareTo(date)==0){
                        output.add(task);
                    }
                }

            }
            return output;
        }catch (Exception e){
            return null;
        }

    }
}
