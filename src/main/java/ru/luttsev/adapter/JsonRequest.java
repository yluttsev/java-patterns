package ru.luttsev.adapter;

/**
 * Класс запроса типа JSON
 * @author Yuri Luttsev
 */
public class JsonRequest implements Json {

    @Override
    public String getJsonData() {
        return "Any info";
    }

    @Override
    public String toString() {
        return "{\n\t\"data\": \"" + getJsonData() + "\"\n}";
    }
}
