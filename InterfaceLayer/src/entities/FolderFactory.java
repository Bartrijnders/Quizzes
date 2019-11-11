package entities;

import entityInterfaces.IFolder;

public class FolderFactory {

    public static IFolder create(String title){
        return  new Folder(title);
    }
}
