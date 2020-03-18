package ru.otus.spring.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnswerTest {

    private static final String description = "test";

    @Test
    public void testGetDescription() {
        Answer answer = new Answer(description);
        Assertions.assertEquals(description, answer.getDescription());
    }

    @Test
    public void testSetDescription() {
        String changedDescription = "test-1";
        Answer answer = new Answer(description);
        answer.setDescription(changedDescription);
        Assertions.assertEquals(changedDescription, answer.getDescription());
    }
}
