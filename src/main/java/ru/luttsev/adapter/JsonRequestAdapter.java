package ru.luttsev.adapter;

public class JsonRequestAdapter implements Json {
    private final XmlRequest xmlRequest;

    public JsonRequestAdapter(XmlRequest xmlRequest) {
        this.xmlRequest = xmlRequest;
    }

    @Override
    public String getJsonData() {
        return xmlRequest.getXmlData();
    }
}
