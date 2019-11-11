package entities;

import entityInterfaces.IFolder;
import entityInterfaces.IListItem;

import java.io.Serializable;
import java.util.List;

public class Folder implements IFolder, Serializable{
    private List<IListItem> items;
    private String title;

    public Folder(String title) {
        this.title = title;
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
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
