package ru.luttsev.chain;

/**
 * Отправитель писем на email
 * @author Yuri Luttsev
 */
public class EmailSender extends Sender {
    @Override
    public void send() {
        System.out.println("Sending an email...");
        // Вызов следующего отправителя
        next();
    }
}
