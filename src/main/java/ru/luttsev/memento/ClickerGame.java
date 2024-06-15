package ru.luttsev.memento;

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

    public void saveState() {
        this.state = new GameState(this.score);
    }

    public void restoreState() {
        if (this.state != null) {
            this.score = this.state.getScore();
        }
    }

    @Override
    public String toString() {
        return "Current score: " + this.score;
    }

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
