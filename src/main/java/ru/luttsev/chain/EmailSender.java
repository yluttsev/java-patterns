package ru.luttsev.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Отправитель писем на email
 * @author Yuri Luttsev
 */
public class EmailSender extends Sender {
    private final Logger log = LogManager.getLogger(EmailSender.class);

    @Override
    public void send() {
        log.info("Sending an email...");
        // Вызов следующего отправителя
        next();
    }
}
