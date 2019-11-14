package sessionhandlers;

import Factory.LabelFactory;
import entityInterfaces.ILabel;

public class NewLabelHandler {
    public static ILabel newLabel(String title){
        return LabelFactory.create(title);
    }
}
