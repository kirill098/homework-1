package ru.otus.spring.service;

import ru.otus.spring.model.Answer;
import ru.otus.spring.model.Question;

import java.util.Map;

public interface TestService {

    Map<Question, Answer> startStudentTest();
}
