package ru.luttsev.chain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SenderTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testChainSenders() {
        Sender emailSender = new EmailSender();
        Sender telegramSender = new TelegramSender();
        Sender smsSender = new SmsSender();
        String expectedOutput = "Sending an email...\r\n" +
                "Sending a message to Telegram...\r\n" +
                "Sending sms...";

        emailSender.setNext(telegramSender);
        telegramSender.setNext(smsSender);
        emailSender.send();

        Assertions.assertEquals(outputStream.toString().trim(), expectedOutput);
    }
}
