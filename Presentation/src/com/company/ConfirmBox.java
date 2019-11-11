package com.company;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    static boolean awnser;

    public static boolean display (String title, String message){
        //new window
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(250);

        // message label
        Label label = new Label(message);

        // button yes
        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            awnser = true;
            window.close();
        });

        //Button no
        Button noButton = new Button("No");
        noButton.setOnAction(e -> {
            awnser = false;
            window.close();
        });

        // layout
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label, yesButton, noButton);
        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.showAndWait();

        return awnser;
    }
}
