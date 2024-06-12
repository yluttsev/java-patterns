package ru.luttsev.adapter;

public class XmlRequest implements Xml {
    @Override
    public String getXmlData() {
        return "Any info";
    }

    @Override
    public String toString() {
        return "<xml>\n\t<data>" + getXmlData() + "</data>\n</xml>";
    }
}
