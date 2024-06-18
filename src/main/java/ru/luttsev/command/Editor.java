package ru.luttsev.command;

import java.io.IOException;

/**
 * Класс редактора текста
 * @author Yuri Luttsev
 */
public class Editor {
    private final TextArea textArea;

    public Editor() {
        this.textArea = new TextArea();
    }

    public TextArea getTextArea() {
        return this.textArea;
    }

    /**
     * Открывает файл по указанному пути
     * @param path путь к файлу
     */
    public void openFile(String path) throws IOException {
        OpenFileCommand openFileCommand = new OpenFileCommand(this, path);
        openFileCommand.execute();
    }

    /**
     * Сохраняет файл по указанному пути
     * @param path путь к файлу
     */
    public void saveFile(String path) throws IOException {
        SaveFileCommand saveFileCommand = new SaveFileCommand(this, path);
        saveFileCommand.execute();
    }
}
