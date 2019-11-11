package organizers;

import entityInterfaces.IFolder;
import entityInterfaces.ITask;

public class FolderTaskRemover {

    public static void removeTask(IFolder folder, ITask task){
        folder.getItems().remove(task);
    }
}
