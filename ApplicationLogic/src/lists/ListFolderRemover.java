package lists;

import entityInterfaces.IFolder;
import entityInterfaces.IToDoList;

public class ListFolderRemover {

    public static void removeFolder(IToDoList toDoList, IFolder folder){
        toDoList.getFolders().remove(folder);
    }
}
