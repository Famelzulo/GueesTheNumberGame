package game;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;
    private List<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGuess(int guess) {
        guesses.add(guess);
    }

    public List<Integer> getGuesses() {
        return guesses;
    }

    public abstract int makeGuess(int min, int max);
}
