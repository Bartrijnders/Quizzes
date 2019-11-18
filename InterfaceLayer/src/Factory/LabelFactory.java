package Factory;


import entities.Colors;
import entities.Label;
import entityInterfaces.ILabel;


public class LabelFactory {
    public static ILabel create(String title, Colors color) {
        return new Label(title, color);
    }

    public static ILabel create(String title) {
        return new Label(title);
    }
}
