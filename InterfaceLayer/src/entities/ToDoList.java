package entities;

import entityInterfaces.IFolder;
import entityInterfaces.IListItem;
import entityInterfaces.IToDoList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ToDoList implements IToDoList, Serializable {
    private List<IListItem> items;
    private List<IFolder> folders;

    public ToDoList() {
        items = new ArrayList<>();
        folders = new ArrayList<>();
    }

    @Override
    public List<IListItem> getItems() {
        return items;
    }

    @Override
    public void setItems(List<IListItem> items) {
        this.items = items;
    }

    @Override
    public List<IFolder> getFolders() {
        return folders;
    }

    @Override
    public void setFolders(List<IFolder> folders) {
        this.folders = folders;
    }
}
