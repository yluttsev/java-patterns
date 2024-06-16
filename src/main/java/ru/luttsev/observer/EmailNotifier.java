package ru.luttsev.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailNotifier implements Observer<Message> {
    private final Logger log = LogManager.getLogger(EmailNotifier.class);
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(Message upd) {
        log.info("Сообщение {} отправлено на {}", upd.text(), this.email);
    }
}
