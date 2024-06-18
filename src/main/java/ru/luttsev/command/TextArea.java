package ru.luttsev.command;

/**
 * Класс текстовой секции
 * @author Yuri Luttsev
 */
public class TextArea {
    private StringBuilder text;

    public TextArea() {
        this.text = new StringBuilder();
    }

    public void append(String text) {
        this.text.append(text);
    }

    public void setText(String text) {
        this.clear();
        this.text.append(text);
    }

    public void clear() {
        this.text.setLength(0);
    }

    public String getText() {
        return text.toString();
    }
}
