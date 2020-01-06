package com.todolist.presentation.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/homepage.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
        primaryStage.setTitle("To-Do List app");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
