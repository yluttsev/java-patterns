package ru.luttsev.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrinterTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final String message = "Hello";
    private final Printer printer = new SimplePrinter();

    @BeforeEach
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testSimplePrinter() {
        printer.print(message);
        Assertions.assertEquals(message, outputStream.toString().trim());
    }

    @Test
    public void testUpperCaseDecorator() {
        Printer upperCaseDecorator = new UpperCaseDecorator(printer);
        upperCaseDecorator.print(message);
        Assertions.assertEquals(message.toUpperCase(), outputStream.toString().trim());
    }

    @Test
    public void testUpperCaseDecoratorWithUnderscoreDecorator() {
        Printer upperCaseDecorator = new UpperCaseDecorator(printer);
        Printer underscoreDecorator = new UnderscoreDecorator(upperCaseDecorator);
        underscoreDecorator.print(message);
        Assertions.assertEquals("_HELLO_", outputStream.toString().trim());
    }
}
