package ru.luttsev.adapter;

public class Validator {
    public boolean validateJson(Json request) {
        return request.getJsonData().equals("Any info");
    }
}
