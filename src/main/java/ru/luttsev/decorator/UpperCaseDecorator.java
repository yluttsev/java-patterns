package ru.luttsev.decorator;

/**
 * Декоратор, преобразующий все символы в верхний регистр
 * @author Yuri Luttsev
 */
public class UpperCaseDecorator extends AbstractDecorator {

    public UpperCaseDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        this.printer.print(message.toUpperCase());
    }
}
