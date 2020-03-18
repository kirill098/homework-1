package ru.otus.spring.service.Impl;

import ru.otus.spring.model.Answer;
import ru.otus.spring.model.Question;
import ru.otus.spring.service.InputInformationService;
import ru.otus.spring.service.OutputInformationService;
import ru.otus.spring.service.ProcessResources;
import ru.otus.spring.service.TestService;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestServiceImpl implements TestService {

    private final OutputInformationService outputInformationService;
    private final InputInformationService inputInformationService;
    private final ProcessResources processResources;

    public TestServiceImpl(
            OutputInformationService outputInformationService,
            InputInformationService inputInformationService,
            ProcessResources processResources) {
        this.outputInformationService = outputInformationService;
        this.inputInformationService = inputInformationService;
        this.processResources = processResources;
    }

    @Override
    public void startStudentTest() {
        Map<Question, Answer> result = new HashMap<>();
        getQuestions().forEach(q -> {
            outputInformationService.printQuestion(q);
            Answer answer = inputInformationService.getAnswer();
            result.put(q, answer);
        });
        outputInformationService.printTestResult(result);
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
