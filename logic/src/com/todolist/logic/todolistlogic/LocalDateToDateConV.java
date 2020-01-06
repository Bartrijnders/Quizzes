package com.todolist.logic.todolistlogic;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateToDateConV {
    public static Date convertToDate(LocalDate date){
        return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

    }
}
