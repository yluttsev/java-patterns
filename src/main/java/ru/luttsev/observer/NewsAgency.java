package ru.luttsev.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject<Message> {
    private final List<Observer<Message>> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer<Message> observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer<Message> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        this.observers.forEach(observer -> observer.update(message));
    }
}
