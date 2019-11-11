package lists;

import entityInterfaces.IList;
import entityInterfaces.ITask;
import entityInterfaces.IToDoList;

public class ListTaskAdder {
    public static void addTask(IToDoList list, ITask task){
        list.getItems().add(task);
    }
}
