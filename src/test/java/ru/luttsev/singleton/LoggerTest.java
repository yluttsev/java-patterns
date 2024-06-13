package ru.luttsev.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTest {
    @Test
    public void testLogger_WithTwoInstances_ReturnEqualsInstances() {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }
}
