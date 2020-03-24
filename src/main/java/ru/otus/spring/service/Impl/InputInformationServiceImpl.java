package ru.otus.spring.service.Impl;

import org.springframework.stereotype.Service;
import ru.otus.spring.model.Answer;
import ru.otus.spring.service.InputInformationService;

import java.io.InputStream;
import java.util.Scanner;

@Service
public class InputInformationServiceImpl implements InputInformationService {

    private final Scanner scanner;

    public InputInformationServiceImpl(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    @Override
    public Answer getAnswer() {
        String answer = scanner.nextLine();
        return new Answer(answer);
    }
}
