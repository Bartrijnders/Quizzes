package sessionhandlers;

import filedata.FIleSaver;
import filedataInterfaces.IDataSaver;
import session.Session;

import java.io.IOException;

public class ExitSessionHandler {
    public static void exit(Session session) throws IOException {
        IDataSaver dataSaver = new FIleSaver();
        dataSaver.save(session.getToDoList());
    }
}
