package ru.otus.spring.model;

public class Question {

    private String description;

    public Question(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
