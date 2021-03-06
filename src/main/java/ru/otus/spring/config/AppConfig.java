package ru.otus.spring.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.io.InputStream;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
        ms.setBasename("test");
        ms.setDefaultEncoding("UTF-8");
        return ms;
    }

    @Bean
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Bean
    public InputStream inputStream() {
        return System.in;
    }
}
