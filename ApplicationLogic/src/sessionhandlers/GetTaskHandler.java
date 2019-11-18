package sessionhandlers;

import entityInterfaces.IListItem;
import entityInterfaces.ITask;
import session.ISession;

import java.util.ArrayList;
import java.util.List;

public class GetTaskHandler {
    public static List<ITask> getTasks(ISession session){
        List<ITask> output = new ArrayList<>();
        for(IListItem item: session.getToDoList().getItems()){
            if(item instanceof ITask){
                output.add((ITask)item);
            }
        }
        return output;
    }
}
