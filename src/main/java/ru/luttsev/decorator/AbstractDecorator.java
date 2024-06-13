package ru.luttsev.decorator;

/**
 * Абстрактный класс декоратора
 * @author Yuri Luttsev
 */
public abstract class AbstractDecorator implements Printer {
    protected Printer printer;

    public AbstractDecorator(Printer printer) {
        this.printer = printer;
    }
}
