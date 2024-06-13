package ru.luttsev.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YandexApiProxyTest {

    @Test
    public void testYandexApiProxyInitDataWhenAccess() {
        long startTime = System.currentTimeMillis();
        YandexApi yandexApiProxy = new YandexApiProxy();
        long endTime = System.currentTimeMillis();
        Assertions.assertTrue(endTime - startTime < 3000);
    }

    @Test
    public void testYandexApiProxyDataCaching() {
        YandexApi yandexApiProxy = new YandexApiProxy();
        String data1 = yandexApiProxy.loadData();
        long startTime = System.currentTimeMillis();
        String data2 = yandexApiProxy.loadData();
        long endTime = System.currentTimeMillis();
        Assertions.assertAll(
                () -> Assertions.assertEquals(data1, data2),
                () -> Assertions.assertTrue(endTime - startTime < 5000)
        );
    }
}
