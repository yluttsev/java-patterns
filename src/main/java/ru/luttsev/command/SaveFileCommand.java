package ru.luttsev.command;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс команды для сохранения текста в файле
 * @author Yuri Luttsev
 */
public class SaveFileCommand implements Executable {
    private final Editor editor;
    private final String pathToSave;

    public SaveFileCommand(Editor editor, String pathToSave) {
        this.editor = editor;
        this.pathToSave = pathToSave;
    }

    @Override
    public void execute() throws IOException {
        try (FileWriter fileWriter = new FileWriter(this.pathToSave)) {
            fileWriter.write(this.editor.getTextArea().getText());
        }
    }
}
