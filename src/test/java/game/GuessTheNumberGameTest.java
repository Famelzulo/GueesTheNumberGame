package game;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {

    @Test
    void testCheckGuess() {
        Player mockPlayer = mock(Player.class);
        when(mockPlayer.makeGuess(anyInt(), anyInt())).thenReturn(50);
        when(mockPlayer.getName()).thenReturn("MockPlayer");

        GuessTheNumberGame.setTargetNumber(50);
        GuessTheNumberGame.checkGuess(mockPlayer);
        verify(mockPlayer, times(1)).makeGuess(anyInt(), anyInt());
        assertTrue(GuessTheNumberGame.isGameWon());
    }
}

