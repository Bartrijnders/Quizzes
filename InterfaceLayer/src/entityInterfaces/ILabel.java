package entityInterfaces;

import entities.Colors;
import java.io.Serializable;

public interface ILabel extends Serializable {
    String getTitle();

    void setTitle(String title);

    Colors getColor();

    void setColor(Colors color);
}
