package entityInterfaces;

import java.io.Serializable;
import java.util.Date;

public interface ITask extends Serializable, IListItem {
    String getTitle();

    void setTitle(String title);

    boolean isChecked();

    void setChecked(boolean checked);

    Date getDateOfCreation();

    ILabel getLabel();

    void setLabel(ILabel label);
}
