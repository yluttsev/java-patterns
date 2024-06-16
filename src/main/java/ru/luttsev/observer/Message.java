package ru.luttsev.observer;

import java.time.LocalDateTime;

public record Message(
        String text,
        LocalDateTime time
) { }
