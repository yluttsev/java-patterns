package ru.luttsev.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.test.appender.ListAppender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SenderTest {

    @Test
    public void testChainSenders() {
        Sender emailSender = new EmailSender();
        Sender telegramSender = new TelegramSender();
        Sender smsSender = new SmsSender();
        String expectedOutput = """
                Sending an email...
                Sending a message to Telegram...
                Sending sms...""";

        Logger emailLogger = (Logger) LogManager.getLogger(EmailSender.class);
        Logger telegramLogger = (Logger) LogManager.getLogger(TelegramSender.class);
        Logger smsLogger = (Logger) LogManager.getLogger(SmsSender.class);
        ListAppender listAppender = new ListAppender("ListAppender");

        emailLogger.addAppender(listAppender);
        telegramLogger.addAppender(listAppender);
        smsLogger.addAppender(listAppender);

        listAppender.start();
        emailSender.setNext(telegramSender);
        telegramSender.setNext(smsSender);
        emailSender.send();

        List<String> logMessages = listAppender.getEvents().stream()
                .map(event -> event.getMessage().getFormattedMessage())
                .toList();
        Assertions.assertEquals(String.join("\n", logMessages), expectedOutput);
    }
}
