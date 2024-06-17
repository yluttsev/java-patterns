package ru.luttsev.chain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Отправитель сообщений в Telegram
 * @author Yuri Luttsev
 */
public class TelegramSender extends Sender {
    private final Logger log = LogManager.getLogger(TelegramSender.class);

    @Override
    public void send() {
        log.info("Sending a message to Telegram...");
        // Вызов следющего отправителя
        next();
    }
}
