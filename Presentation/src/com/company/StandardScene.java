package com.company;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public abstract class StandardScene {

    private Scene scene;
    private BorderPane layout;

    public StandardScene() {
        layout = new BorderPane();
    }

    public BorderPane getLayout() {
        return layout;
    }
}
