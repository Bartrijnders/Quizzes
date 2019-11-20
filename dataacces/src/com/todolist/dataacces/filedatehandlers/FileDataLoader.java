package com.todolist.dataacces.filedatehandlers;

import com.todolist.domain.interfaces.IToDoList;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileDataLoader implements IDataLoader {

    @Override
    public IToDoList load() {
        IToDoList output = null;
        File file = SaveFileFinder.getSaveFile();
        assert file != null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            output = (IToDoList) objectInputStream.readObject();
            return output;

        } catch (Exception e) {
            System.out.println("ERROR in file reading\n" + e.getMessage());
            return output;
        } finally {
            if (output != null) {
                System.out.println("reading save file succeeded");
            } else {
                System.out.println("reading save file has failed");
            }
        }

    }
}
