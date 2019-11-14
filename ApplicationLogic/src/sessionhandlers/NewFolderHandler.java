package sessionhandlers;

import Factory.FolderFactory;
import entityInterfaces.IFolder;

public class NewFolderHandler {
    public static IFolder newFolder(String title){
        return FolderFactory.create(title);
    }
}
