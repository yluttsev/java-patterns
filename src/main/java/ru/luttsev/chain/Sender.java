package ru.luttsev.chain;

/**
 * Абстрактный класс отправителя
 * @author Yuri Luttsev
 */
public abstract class Sender {
    private Sender nextSender;

    public void setNext(Sender nextSender) {
        this.nextSender = nextSender;
    }

    /**
     * Вызывает следующего отправителя в цепочке вызовов
     */
    protected void next() {
        if (this.nextSender != null) {
            this.nextSender.send();
        }
    }

    public abstract void send();
}
