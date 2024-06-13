package ru.luttsev.proxy;

/**
 * Класс-прокси для YandexApiImpl {@link YandexApiImpl}
 * @author Yuri Luttsev
 */
public class YandexApiProxy implements YandexApi {

    private YandexApi yandexApi;
    /** Кэшированная информация */
    private String cacheData;

    /**
     * Производит инициализацию только при вызове метода,
     * а не при создании прокси, а также производит кэширование
     *
     * @return кэшированная информация
     */
    @Override
    public String loadData() {
        if (this.yandexApi == null) {
            this.yandexApi = new YandexApiImpl();
        }
        if (this.cacheData == null) {
            this.cacheData = this.yandexApi.loadData();
        }
        return cacheData;
    }

}
