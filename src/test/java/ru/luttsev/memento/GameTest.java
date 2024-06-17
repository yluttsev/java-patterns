package ru.luttsev.memento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    private final ClickerGame game = new ClickerGame();
    private final int score = 10;

    @Test
    public void testGameState() {
        for (int i = 0; i < score; i++) {
            game.click();
        }
        game.saveState();
        for (int i = 0; i < 5; i++) {
            game.click();
        }
        game.restoreState();
        Assertions.assertEquals(game.getScore(), score);
    }
}
