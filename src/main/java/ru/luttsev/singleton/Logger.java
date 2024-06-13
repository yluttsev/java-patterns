package ru.luttsev.singleton;

import java.time.LocalDateTime;

/**
 * Класс логгера, реализующий паттерн Singleton с Double-Checked Locking
 * @author Yuri Luttsev
 *
 * {@value LOGGING_PATTERN} Шаблон сообщения при выводе логов
 */
public class Logger {
    private static volatile Logger instance;
    private static final String LOGGING_PATTERN = "[%s] [%s] %s";

    private Logger() {}

    /**
     * Метод для получения экземпляра класса
     *
     * @return возвращает экземпляр логгера
     */
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }

    /**
     * Приватный метод логирования во избежание дублирования кода
     *
     * @param level Уровень логирования {@link LogLevel}
     * @param message Сообщение, выводящееся в логе
     */
    private void log(LogLevel level, String message) {
        System.out.println(LOGGING_PATTERN.formatted(LocalDateTime.now().toString(), level.name(), message));
    }

    /**
     * Метод логирования для уровня TRACE
     *
     * @param message Сообщение, выводящееся в логе
     */
    public void trace(String message) {
        this.log(LogLevel.TRACE, message);
    }

    /**
     * Метод логирования для уровня DEBUG
     *
     * @param message Сообщение, выводящееся в логе
     */
    public void debug(String message) {
        this.log(LogLevel.DEBUG, message);
    }

    /**
     * Метод логирования для уровня INFO
     *
     * @param message Сообщение, выводящееся в логе
     */
    public void info(String message) {
        this.log(LogLevel.INFO, message);
    }

    /**
     * Метод логирования для уровня WARN
     *
     * @param message Сообщение, выводящееся в логе
     */
    public void warn(String message) {
        this.log(LogLevel.WARN, message);
    }

    /**
     * Метод логирования для уровня ERROR
     *
     * @param message Сообщение, выводящееся в логе
     */
    public void error(String message) {
        this.log(LogLevel.ERROR, message);
    }

    /**
     * Метод логирования для уровня FATAL
     *
     * @param message Сообщение, выводящееся в логе
     */
    public void fatal(String message) {
        this.log(LogLevel.FATAL, message);
    }
}
