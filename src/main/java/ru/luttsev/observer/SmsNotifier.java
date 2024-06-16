package ru.luttsev.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SmsNotifier implements Observer<Message> {
    private final Logger log = LogManager.getLogger(SmsNotifier.class);
    private String phoneNumber;

    public SmsNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Message upd) {
        log.info("Сообщение {} отправлено на номер: {}", upd.text(), this.phoneNumber);
    }
}
