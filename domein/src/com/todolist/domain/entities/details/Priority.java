package com.todolist.domain.entities.details;

import com.todolist.domain.enums.Priorities;
import com.todolist.domain.interfaces.IDetail;

public class Priority implements IDetail {

    private Priorities prio;
    private String type;

    public Priority(Priorities priority) {
        this.prio = priority;
        type = "Priority";
    }

    @Override
    public String getValue() {
        return prio.toString();
    }

    @Override
    public String getType() {
        return type;
    }
}
