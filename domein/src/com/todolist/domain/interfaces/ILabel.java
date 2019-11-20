package com.todolist.domain.interfaces;


import com.todolist.domain.enums.Colors;

import java.io.Serializable;

public interface ILabel extends Serializable {
    String getTitle();

    void setTitle(String title);

    Colors getColor();

    void setColor(Colors color);
}

