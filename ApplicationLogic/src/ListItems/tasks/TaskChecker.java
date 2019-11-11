package ListItems.tasks;

import entityInterfaces.ITask;

public class TaskChecker {

    // flips the the checked value of a task
    public static void check(ITask task){
        task.setChecked(!task.isChecked());
    }
}
