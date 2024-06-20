import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getMarker() {
        Player playerX = new Player('X');
        Player playerO = new Player('O');

        assertEquals('X', playerX.getMarker());
        assertEquals('O', playerO.getMarker());
    }
}