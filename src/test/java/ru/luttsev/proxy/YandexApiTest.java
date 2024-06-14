package ru.luttsev.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YandexApiTest {

    @Test
    public void testOriginalYandexApiDurationOfInitialization() {
        long startTime = System.currentTimeMillis();
        YandexApi yandexApi = new YandexApiImpl();
        long endTime = System.currentTimeMillis();
        Assertions.assertTrue(endTime - startTime >= 5000);
    }

    @Test
    public void testOriginalYandexApiDurationOfReceivingInfo() {
        YandexApi yandexApi = new YandexApiImpl();
        long startTime = System.currentTimeMillis();
        String data = yandexApi.loadData();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        Assertions.assertTrue(endTime - startTime >= 5000);
    }
}
