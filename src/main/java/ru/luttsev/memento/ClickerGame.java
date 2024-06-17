package ru.luttsev.memento;

/**
 * Главный класс игры
 * @author Yuri Luttsev
 */
public class ClickerGame {
    private int score;
    private GameState state;

    public int getScore() {
        return score;
    }

    public ClickerGame() {
        this.score = 0;
    }

    public void click() {
        this.score++;
    }

    /**
     * Сохраняет текущее состояние игры
     */
    public void saveState() {
        this.state = new GameState(this.score);
    }

    /**
     * Восстанавливает последнее сохраненное состояние игры
     */
    public void restoreState() {
        if (this.state != null) {
            this.score = this.state.getScore();
        }
    }

    @Override
    public String toString() {
        return "Current score: " + this.score;
    }

    /**
     * Внутренний класс, описывающий состояние игры
     */
    private class GameState {
        private final int score;

        public GameState(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }
}
