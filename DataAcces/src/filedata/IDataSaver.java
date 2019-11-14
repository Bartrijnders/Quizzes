package filedata;

import entityInterfaces.IList;

import java.io.IOException;

public interface IDataSaver {
    void save(IList list) throws IOException;
}
