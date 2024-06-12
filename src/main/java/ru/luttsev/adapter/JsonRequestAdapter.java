package ru.luttsev.adapter;

/**
 * Класс адаптера для преобразования данных JSON в XML
 * @author Yuri Luttsev
 */
public class JsonRequestAdapter implements Json {
    /** XML запрос для преобразования */
    private final XmlRequest xmlRequest;

    public JsonRequestAdapter(XmlRequest xmlRequest) {
        this.xmlRequest = xmlRequest;
    }

    @Override
    public String getJsonData() {
        return xmlRequest.getXmlData();
    }
}
