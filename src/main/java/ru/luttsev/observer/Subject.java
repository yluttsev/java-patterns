package ru.luttsev.observer;

public interface Subject<T> {
    void addObserver(Observer<T> observer);
    void deleteObserver(Observer<T> observer);
    void notifyObservers(Message message);
}
