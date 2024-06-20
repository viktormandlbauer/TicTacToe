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
    void testClear(){
        board.place(0,0,'X');
        board.clear();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                assertEquals(' ', board.cells[i][j]);
            }
        }
    }

    @Test
    void testIsCellEmpty(){
        assertTrue(board.isCellEmpty(0,0));
        board.place(0,0,'X');
        assertFalse(board.isCellEmpty(0,0));
    }

    @Test
    void testPlace(){
        board.place(1,1,'X');
        assertEquals('X', board.cells[1][1]);
    }

    @Test
    void testIsFull(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board.place(i, j, 'X');
            }
        }
        assertTrue(board.isFull());
    }
}
