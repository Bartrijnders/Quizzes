package com.todolist.presentation.eventHandlers.homepage;

import com.todolist.presentation.controllers.newtaskpageController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class NewTaskButtonEvent {

    public void handleClick(ActionEvent event){
        try {
            newtaskpageController newtaskpageController = new newtaskpageController();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/newtaskpage.fxml"));
            fxmlLoader.setController(newtaskpageController);
            Parent root = fxmlLoader.load();
            Stage window = new Stage();
            Scene scene = new Scene(root, 600, 400);
            window.setScene(scene);
            window.show();
            window.setTitle("taak aanmaken");
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace().toString());
        }

    }
}
