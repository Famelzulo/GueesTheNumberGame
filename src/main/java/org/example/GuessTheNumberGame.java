package game;

import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber = random.nextInt(100) + 1;
    private static boolean gameWon = false;
    private static int minRange = 1;
    private static int maxRange = 100;

    public static void main(String[] args) {
        game.Player humanPlayer = new HumanPlayer("Human");
        game.Player computerPlayer = new ComputerPlayer("Computer");

        System.out.println("Guess the number between 1 and 100.");

        while (!gameWon) {
            checkGuess(humanPlayer);
            if (!gameWon) {
                checkGuess(computerPlayer);
            }
        }
    }

    public static void checkGuess(Player player) {
        int guess = player.makeGuess(minRange, maxRange);
        player.addGuess(guess);
        System.out.println(player.getName() + " guessed: " + guess);

        if (guess == targetNumber) {
            System.out.println(player.getName() + " wins!");
            gameWon = true;
            System.out.println(player.getName() + "'s guesses: " + player.getGuesses());
        } else if (guess < targetNumber) {
            System.out.println("The target number is higher.");
            minRange = Math.max(minRange, guess + 1);
        } else {
            System.out.println("The target number is lower.");
            maxRange = Math.min(maxRange, guess - 1);
        }
    }

    // Métodos de acceso para las pruebas
    public static void setTargetNumber(int number) {
        targetNumber = number;
    }

    public static boolean isGameWon() {
        return gameWon;
    }

    public static void resetGame() {
        gameWon = false;
        targetNumber = random.nextInt(100) + 1;
        minRange = 1;
        maxRange = 100;
    }
}
