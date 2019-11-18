package Factory;

import entities.Folder;
import entityInterfaces.IFolder;

public class FolderFactory {

    public static IFolder create(String title) {
        return new Folder(title);
    }
}
