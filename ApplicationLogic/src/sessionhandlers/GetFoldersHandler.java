package sessionhandlers;

import entityInterfaces.IFolder;
import session.Session;

import java.util.List;

public class GetFoldersHandler {
    public static List<IFolder> getFolders(Session session){
        return session.getToDoList().getFolders();
    }
}
