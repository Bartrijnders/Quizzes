package Factory;

import entities.Task;
import entityInterfaces.ITask;

public class TaskFactory {

    // creates and returns a new ITask object : Task
    public static ITask create(String title) {
        return new Task(title);
    }
}
