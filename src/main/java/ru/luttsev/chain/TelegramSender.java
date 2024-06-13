package ru.luttsev.chain;

/**
 * Отправитель сообщений в Telegram
 * @author Yuri Luttsev
 */
public class TelegramSender extends Sender {
    @Override
    public void send() {
        System.out.println("Sending a message to Telegram...");
        // Вызов следющего отправителя
        next();
    }
}
