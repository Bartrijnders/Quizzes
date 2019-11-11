package ListItems.tasks;


import entityInterfaces.ILabel;
import entityInterfaces.ITask;

public class TaskLabelAdder {

    // adds a label to task
    public static void addLabel(ITask task, ILabel label){
        task.setLabel(label);
    }
}
