package ListItems.tasks;

import entityInterfaces.ITask;

public class TaskLabelRemover {

    // removes label from task
    public static void removeLabel(ITask task){
        task.setLabel(null);
    }
}
