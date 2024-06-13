package ru.luttsev.chain;

/**
 * Отправитель SMS сообщений
 * @author Yuri Luttsev
 */
public class SmsSender extends Sender {
    @Override
    public void send() {
        System.out.println("Sending sms...");
        // Вызов следющего отправителя
        next();
    }
}
