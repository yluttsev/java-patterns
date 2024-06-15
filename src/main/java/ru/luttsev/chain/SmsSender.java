package ru.luttsev.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Отправитель SMS сообщений
 * @author Yuri Luttsev
 */
public class SmsSender extends Sender {
    private final Logger log = LogManager.getLogger(SmsSender.class);

    @Override
    public void send() {
        log.info("Sending sms...");
        // Вызов следющего отправителя
        next();
    }
}
