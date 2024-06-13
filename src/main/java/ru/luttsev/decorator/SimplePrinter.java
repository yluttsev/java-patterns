package ru.luttsev.decorator;

/**
 * Класс простого принтера
 * @author Yuri Luttsev
 */
public class SimplePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
