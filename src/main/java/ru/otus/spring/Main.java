package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.model.Answer;
import ru.otus.spring.model.Question;
import ru.otus.spring.service.TestService;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        TestService testService = context.getBean(TestService.class);
        Map<Question, Answer> result = testService.startStudentTest();
        result.entrySet().forEach(r -> System.out.println("Вопрос: " + r.getKey().getDescription() +
                ". Ответ: " + r.getValue().getDescription()));
    }
}
