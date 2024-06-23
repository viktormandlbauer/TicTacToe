import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TicTacToeTest {

    @BeforeEach
    public void setUp() {
        TicTacToe game = new TicTacToe();}

    @Test
    void dummyTest() {

        // do something
        assertEquals(1,1);
    }

        @Test
        public void testSwitchCurrentPlay_Positive() {
            TicTacToe game = new TicTacToe();
            game.switchCurrentPlay();
            assertEquals('O', game.getCurrentPlayer().getMarker());
        }

        @Test
        public void testSwitchCurrentPlay_Negative() {
            TicTacToe game = new TicTacToe();
            game.switchCurrentPlay();
            assertNotEquals('X', game.getCurrentPlayer().getMarker());
        }
}