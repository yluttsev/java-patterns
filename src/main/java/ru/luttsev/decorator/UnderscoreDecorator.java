package ru.luttsev.decorator;

/**
 * Декоратор, добавляющий нижние подчеркивания в начале и конце сообщения
 * @author Yuri Luttsev
 */
public class UnderscoreDecorator extends AbstractDecorator {

    public UnderscoreDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        this.printer.print("_%s_".formatted(message));
    }
}
