package ru.otus.spring.model;

public class Answer {

    private String description;

    public Answer(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
