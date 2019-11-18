package sessionhandlers;

import Factory.TaskFactory;
import entityInterfaces.ITask;

public class NewTaskHandler {
    public static ITask newTask(String title){
        return TaskFactory.create(title);
    }
}
