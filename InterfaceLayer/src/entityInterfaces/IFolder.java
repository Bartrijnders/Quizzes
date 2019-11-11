package entityInterfaces;

import java.io.Serializable;
import java.util.List;

public interface IFolder extends Serializable {
    List<IListItem> getItems();

    void setItems(List<IListItem> items);

    String getTitle();

    void setTitle(String title);
}
