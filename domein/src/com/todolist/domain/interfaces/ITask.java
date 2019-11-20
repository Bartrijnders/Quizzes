package com.todolist.domain.interfaces;

import java.util.Date;

public interface ITask {
    String getTitle();

    void setTitle(String title);

    boolean isChecked();

    void setChecked(boolean checked);

    Date getDateOfCreation();

    ILabel getLabel();

    void setLabel(ILabel label);
}
