package lists;

import entityInterfaces.ITask;
import entityInterfaces.IToDoList;

public class ListTaskRemover {
    public static void removerTask(IToDoList toDoList, ITask task){
        toDoList.getItems().remove(task);
    }
}
