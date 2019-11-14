package filedata;

import entityInterfaces.IList;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileReader implements IDataReader {

    @Override
    public IList read() {
        IList output = null;
        File file = SaveFileFinder.getSaveFile();
        try( FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
            output = (IList)objectInputStream.readObject();
            return output;

        } catch (Exception e) {
            System.out.println("ERROR in file reading\n" + e.getMessage());
            return output;
        }
        finally {
            if(output != null){
                System.out.println("reading save file succeeded");
            }
            else{
                System.out.println("reading save file has failed");
            }
        }

    }
}
