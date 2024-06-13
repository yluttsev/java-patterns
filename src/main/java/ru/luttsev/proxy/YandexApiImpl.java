package ru.luttsev.proxy;

/**
 * Реализация API
 * @author Yuri Luttsev
 */
public class YandexApiImpl implements YandexApi {

    /**
     * Конструктор, в котором выполняется долгая инициализация
     */
    public YandexApiImpl() {
        System.out.println("Init api");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Загрузка тяжелых данных
     * @return некоторые данные
     */
    @Override
    public String loadData() {
        System.out.println("Loading data");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Some data";
    }

}
