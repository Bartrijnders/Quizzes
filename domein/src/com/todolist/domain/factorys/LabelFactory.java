package com.todolist.domain.factorys;

import com.todolist.domain.entities.Label;
import com.todolist.domain.interfaces.ILabel;

public class LabelFactory {
    public static ILabel create(String name) {
        return new Label(name);
    }
}
