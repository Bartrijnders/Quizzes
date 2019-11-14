package entityInterfaces;

import java.util.Date;

public interface ITask extends IListItem {
    String getTitle();

    void setTitle(String title);

    boolean isChecked();

    void setChecked(boolean checked);

    Date getDateOfCreation();

    ILabel getLabel();

    void setLabel(ILabel label);
}
