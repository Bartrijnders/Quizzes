package com.todolist.domain.interfaces;

import java.util.Date;
import java.util.List;

public interface ITask {
    String getTitle();

    void setTitle(String title);

    boolean isChecked();

    void setChecked(boolean checked);

    Date getDateOfCreation();

    ILabel getLabel();

    void setDateOfCreation(Date dateOfCreation);

    void setLabel(ILabel label);

    void setDetails(List<IDetail> details);

    List<IDetail> getDetails();
}
