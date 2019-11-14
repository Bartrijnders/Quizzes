package Factory;

import entities.ToDoList;

public class ToDoListFactory {

    public static ToDoList create() {
        return new ToDoList();
    }
}
