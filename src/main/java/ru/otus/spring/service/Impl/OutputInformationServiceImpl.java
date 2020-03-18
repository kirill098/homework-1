package ru.otus.spring.service.Impl;

import ru.otus.spring.model.Answer;
import ru.otus.spring.model.Question;
import ru.otus.spring.service.OutputInformationService;

import java.util.Map;

public class OutputInformationServiceImpl implements OutputInformationService {

    @Override
    public void printTestResult(Map<Question, Answer> map) {
        map.entrySet().forEach(r ->
                System.out.println(
                        "Вопрос: " + r.getKey().getDescription() + ". " +
                        "Ответ: " + r.getValue().getDescription())
        );
    }

    @Override
    public void printQuestion(Question question) {
        System.out.println(question.getDescription());
    }


}
