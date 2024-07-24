package game;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess(int min, int max) {
        System.out.print("Enter your guess (" + min + " - " + max + "): ");
        return scanner.nextInt();
    }
}
