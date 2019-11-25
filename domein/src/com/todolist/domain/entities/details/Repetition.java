package com.todolist.domain.entities.details;

import com.todolist.domain.interfaces.IDetail;

public class Repetition implements IDetail {

    private Repetition rep;
    private String type;

    public Repetition(Repetition rep) {
        this.rep = rep;
        type = "Repetition";
    }

    @Override
    public String getValue() {
        return rep.toString();
    }

    @Override
    public String getType() {
        return type;
    }
}
