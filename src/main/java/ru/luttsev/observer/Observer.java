package ru.luttsev.observer;

public interface Observer<T> {
    void update(T upd);
}
