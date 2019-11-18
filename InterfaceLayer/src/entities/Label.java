package entities;

import entityInterfaces.ILabel;

import java.io.Serializable;


public class Label implements ILabel, Serializable {

    //fields
    private String title;
    private Colors color;


    public Label(String title) {
        this.title = title;
    }

    // second constructor for the case if the user want to add a color to the label.
    public Label(String title, Colors color) {
        this.title = title;
        this.color = color;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public void setColor(Colors color) {
        this.color = color;
    }
}
