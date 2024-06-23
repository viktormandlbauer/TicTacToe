import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    private Board board;

    @BeforeEach
    void setUp(){
        board = new Board();
    }

    @Test
    public void testIsCellEmpty_Positive() {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0));  // Testet eine leere Zelle
    }

    @Test
    public void testIsCellEmpty_Negative() {
        Board board = new Board();
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));  // Testet eine gefüllte Zelle
    }

    @Test
    public void testPlace_Positive() {
        Board board = new Board();
        board.place(0, 0, 'X');
        assertEquals('X', board.cells[0][0]);  // Testet das Platzieren eines Markers
    }

    @Test
    public void testPlace_Negative() {
        Board board = new Board();
        board.place(0, 0, 'X');
        assertNotEquals('O', board.cells[0][0]);  // Testet, dass der Marker nicht falsch ist
    }

    @Test
    public void testIsFull_Positive() {
        Board board = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }
        assertTrue(board.isFull());  // Testet, dass das Board voll ist
    }

    @Test
    public void testIsFull_Negative() {
        Board board = new Board();
        assertFalse(board.isFull());  // Testet, dass das Board anfangs nicht voll ist
    }

    @Test
    public void testClear_Positive() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.clear();
        assertTrue(board.isCellEmpty(0, 0));  // Testet, dass das Board nach dem Leeren leer ist
    }

    @Test
    public void testClear_Negative() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.clear();
        assertFalse(board.cells[0][0] == 'X');  // Testet, dass das Board nach dem Leeren keinen Marker enthält
    }
}
