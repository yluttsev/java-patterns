package ru.luttsev.command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Класс для команды открытия файла в редакторе
 * @author Yuri Luttsev
 */
public class OpenFileCommand implements Executable {
    private final Editor editor;
    private final String pathToOpen;

    public OpenFileCommand(Editor editor, String pathToOpen) {
        this.editor = editor;
        this.pathToOpen = pathToOpen;
    }

    @Override
    public void execute() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(pathToOpen));
        this.editor.getTextArea().setText(String.join("\n", lines));
    }
}
