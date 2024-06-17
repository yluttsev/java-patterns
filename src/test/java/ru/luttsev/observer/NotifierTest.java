package ru.luttsev.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.test.appender.ListAppender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class NotifierTest {
    private final ListAppender listAppender = new ListAppender("ListAppender");

    @BeforeEach
    public void setListAppender() {
        ((Logger) LogManager.getLogger(EmailNotifier.class)).addAppender(this.listAppender);
        ((Logger) LogManager.getLogger(SmsNotifier.class)).addAppender(this.listAppender);
    }

    @Test
    public void testNotify() {
        NewsAgency agency = new NewsAgency();
        String message = "Test message";
        String expectedOutput = """
                Сообщение %s отправлено на test@test.ru
                Сообщение %s отправлено на номер: +7 (900) 123-45-67
                Сообщение %s отправлено на test2@test.ru""".formatted(message, message, message);
        agency.addObserver(new EmailNotifier("test@test.ru"));
        agency.addObserver(new SmsNotifier("+7 (900) 123-45-67"));
        agency.addObserver(new EmailNotifier("test2@test.ru"));

        this.listAppender.start();
        agency.notifyObservers(new Message("Test message", LocalDateTime.now()));
        List<String> logMessages = listAppender.getEvents().stream()
                .map(event -> event.getMessage().getFormattedMessage())
                .toList();

        Assertions.assertEquals(String.join("\n", logMessages), expectedOutput);
    }
}
