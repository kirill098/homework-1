package ru.otus.spring.service.Impl;

import ru.otus.spring.model.Answer;
import ru.otus.spring.service.InputInformationService;

import java.util.Scanner;

public class InputInformationServiceImpl implements InputInformationService {

    private final Scanner scanner;

    public InputInformationServiceImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Answer getAnswer() {
        String answer = scanner.nextLine();
        return new Answer(answer);
    }
}
