package game;

import java.util.Random;

public class ComputerPlayer extends Player {
    public Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override
    public int makeGuess(int min, int max) {
        int guess = random.nextInt(max - min + 1) + min;
        System.out.println(getName() + " guesses: " + guess);
        return guess;
    }
}
