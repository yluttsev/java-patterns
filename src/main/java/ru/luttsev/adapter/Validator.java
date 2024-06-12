package ru.luttsev.adapter;

/**
 * Класс валидатора для валидации данных типа JSON
 * @author Yuri Luttsev
 */
public class Validator {
    /**
     * Метод валидации запроса
     * @param request Запрос типа JSON
     * @return возвращает валидность данных
     */
    public boolean validateJson(Json request) {
        return request.getJsonData().equals("Any info");
    }
}
