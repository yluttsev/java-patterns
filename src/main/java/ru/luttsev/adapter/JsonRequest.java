package ru.luttsev.adapter;

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
