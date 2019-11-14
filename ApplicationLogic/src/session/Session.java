package session;

import entityInterfaces.IToDoList;
import filedata.FileReader;
import filedataInterfaces.IDataReader;

public class Session implements ISession {
    private IToDoList toDoList;

    public Session() {
        IDataReader reader = new FileReader();
        toDoList = (IToDoList) reader.read();
    }

    @Override
    public IToDoList getToDoList() {
        return toDoList;
    }
}


