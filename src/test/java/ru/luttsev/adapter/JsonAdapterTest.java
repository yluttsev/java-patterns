package ru.luttsev.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonAdapterTest {
    @Test
    public void testJsonRequest() {
        Validator validator = new Validator();
        JsonRequest json = new JsonRequest();
        Assertions.assertTrue(validator.validateJson(json));
    }

    @Test
    public void testXmlAsJson() {
        Validator validator = new Validator();
        XmlRequest xmlRequest = new XmlRequest();
        JsonRequestAdapter adapter = new JsonRequestAdapter(xmlRequest);
        Assertions.assertTrue(validator.validateJson(adapter));
    }
}
