package fileSave;

import entityInterfaces.IList;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileReader {

    public IList readSaveFile() {
        try {
            File file = SaveFileFinder.getSaveFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            IList output = (IList)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println("ERROR in file reading\n" + e.getMessage());
        }
        return null;
    }
}
