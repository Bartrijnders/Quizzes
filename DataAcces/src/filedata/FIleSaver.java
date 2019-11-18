package filedata;

import entityInterfaces.IList;
import filedataInterfaces.IDataSaver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FIleSaver implements IDataSaver {



    @Override
    public  void save(IList list){
        File file = SaveFileFinder.getSaveFile();
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
            objectOutputStream.writeObject(list);
            System.out.println("List succesfully written to file");

        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("error in saving the list");
        }

    }
}