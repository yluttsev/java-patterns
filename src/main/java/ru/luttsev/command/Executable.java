package ru.luttsev.command;

import java.io.IOException;

/**
 * Функциональный интерфейс, представляющий одно действие
 * @author Yuri Luttsev
 */
@FunctionalInterface
public interface Executable {
    void execute() throws IOException;
}
