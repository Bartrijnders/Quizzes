package com.rijnders.entities;

import com.rijnders.entityinterfaces.Answer;

public class StandardTurn implements com.rijnders.entityinterfaces.Turn {

    private final int number;
    private final StandardQuestion question;
    private Answer chosenAnswer;

    public StandardTurn(int number, StandardQuestion question, Answer chosenAnswer) {
        this.number = number;
        this.question = question;
        this.chosenAnswer = chosenAnswer;
    }

    public int getNumber() {
        return number;
    }

    public StandardQuestion getQuestion() {
        return question;
    }

    public Answer getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(Answer chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }
}
