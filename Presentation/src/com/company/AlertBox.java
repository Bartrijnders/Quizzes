package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    static void display(String title, String message){
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        StackPane layout = new StackPane();
        Label label = new Label(message);
        Button button = new Button("Close window!");
        layout.getChildren().addAll(label, button);
        Scene scene = new Scene(layout, 100,100);
        button.setOnAction(e -> window.close());
        window.setScene(scene);
        window.showAndWait();


    }
}
