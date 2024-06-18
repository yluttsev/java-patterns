package ru.luttsev.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EditorTests {
    private final String path = "src/main/resources/test.txt";

    @Test
    public void testOpenFileInEditor() throws IOException {
        String content = String.join("", Files.readAllLines(Paths.get(path)));
        Editor editor = new Editor();
        editor.openFile(path);
        Assertions.assertEquals(content, editor.getTextArea().getText());
    }

    @Test
    public void testSaveTextInFile() throws IOException {
        Editor editor = new Editor();
        String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        editor.getTextArea().append(content);
        editor.saveFile(path);
        String fileContent = String.join("", Files.readAllLines(Paths.get(path)));
        Assertions.assertEquals(content, fileContent);
    }
}
