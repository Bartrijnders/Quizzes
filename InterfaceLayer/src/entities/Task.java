package entities;

import entityInterfaces.ILabel;
import entityInterfaces.ITask;

import java.io.Serializable;
import java.util.Date;

public class Task implements ITask, Serializable {

    //fields
    private String title;
    private boolean checked;
    private final Date dateOfCreation;
    private ILabel label;

    public Task(String title) {
        this.title = title;
        this.checked = false;
        this.dateOfCreation = new Date(System.currentTimeMillis());
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean isChecked() {
        return checked;
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    @Override
    public ILabel getLabel() {
        return label;
    }

    @Override
    public void setLabel(ILabel label) {
        this.label = label;
    }
}
