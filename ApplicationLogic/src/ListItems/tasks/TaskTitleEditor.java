package ListItems.tasks;

import entityInterfaces.ITask;

public class TaskTitleEditor {

    // edits the title of a task
    public static void editTitle(ITask task, String newTitle){
        task.setTitle(newTitle);
    }
}
