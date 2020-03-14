package ru.otus.spring.service.Impl;

import ru.otus.spring.model.Answer;
import ru.otus.spring.model.Question;
import ru.otus.spring.service.ProcessResources;
import ru.otus.spring.service.TestService;

import java.util.*;

public class TestServiceImpl implements TestService {

    private ProcessResources processResources;

    public TestServiceImpl(ProcessResources processResources) {
        this.processResources = processResources;
    }

    public Map<Question, Answer> startStudentTest() {
        List<Question> questions = getQuestions();

        Map<Question, Answer> result = new HashMap<>();

        questions.forEach(q -> {
            System.out.println(q.getDescription());
            Scanner scanner = new Scanner(System.in);
            String description = scanner.nextLine();
            result.put(q, new Answer(description));
        });

        return result;
    }

    private List<Question> getQuestions() {
        try {
            return processResources.readQuestions();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            return Collections.emptyList();
        }
    }
}
