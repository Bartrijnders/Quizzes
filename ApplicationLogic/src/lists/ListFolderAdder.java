package lists;

import entityInterfaces.IFolder;
import entityInterfaces.IToDoList;

public class ListFolderAdder {

    public static void addFolder(IToDoList list, IFolder folder){
        list.getFolders().add(folder);
    }
}
