package entityInterfaces;

import java.util.List;

public interface IToDoList extends IList {

    List<IListItem> getItems();

    void setItems(List<IListItem> items);

    List<IFolder> getFolders();

    void setFolders(List<IFolder> folders);
}
