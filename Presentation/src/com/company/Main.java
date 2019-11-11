package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1;
    Scene scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("i am learning!");

        StackPane layout = new StackPane();
        button = new Button("Click me!");
        button.setOnAction(e -> {
            boolean answer = ConfirmBox.display("????", "send nudes?");
            System.out.println(answer);
        });
        layout.getChildren().addAll(button);
        scene1 = new Scene(layout, 300, 300);
        stage.setScene(scene1);
        stage.show();


    }
}
