package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;

class HumanPlayerTest {

    @Test
    void testMakeGuess() {
        HumanPlayer player = new HumanPlayer("TestPlayer");
        ByteArrayInputStream in = new ByteArrayInputStream("50\n".getBytes());
        System.setIn(in);
        int guess = player.makeGuess(1, 100);
        assertEquals(50, guess);
    }
}
