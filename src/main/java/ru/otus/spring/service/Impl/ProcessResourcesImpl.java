package ru.otus.spring.service.Impl;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import ru.otus.spring.model.Question;
import ru.otus.spring.service.ProcessResources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@Service
public class ProcessResourcesImpl implements ProcessResources {

    private final String path;

    public ProcessResourcesImpl(MessageSource messageSource, Locale locale) {
        this.path = messageSource.getMessage("file.path", null, locale);
    }

    @Override
    public List<Question> readQuestions() throws Exception {
        List<Question> questions = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String description = clearedLine(scanner.nextLine());
                if (!StringUtils.isEmpty(description)) {
                    questions.add(new Question(description));
                }
            }
            return questions;
        }
    }

    private String clearedLine(String line) {
        return line.replace(";", "");
    }
}
