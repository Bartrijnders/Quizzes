package com.todolist.domain.entities.details;

import com.todolist.domain.interfaces.IDetail;

public class Description implements IDetail {

    private String text;
    private String type;

    public Description(String text) {
        this.text = text;
        type = "Description";
    }

    @Override
    public String getValue() {
        return text;
    }

    @Override
    public String getType() {
        return type;
    }
}
