package com.todolist.dataacces.filedatehandlers;

import com.todolist.domain.interfaces.IToDoList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class
FileDataSaver implements IDataSaver {


    public void save(IToDoList toDoList) {
        File file = SaveFileFinder.getSaveFile();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(toDoList);
            System.out.println("List succesfully written to file");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("error in saving the list");
        }
    }
}
