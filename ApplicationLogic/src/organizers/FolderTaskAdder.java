package organizers;

import entityInterfaces.IFolder;
import entityInterfaces.IListItem;
import entityInterfaces.ITask;
import entityInterfaces.IToDoList;

public class FolderTaskAdder {
    public static void addToFOlder(IFolder folder, IListItem item){
        folder.getItems().add(item);
    }
}
