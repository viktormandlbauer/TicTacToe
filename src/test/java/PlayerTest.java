import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;

    @Test
    public void testGetMarker1() {
        player = new Player('X');
        assertEquals('X', player.getMarker());
    }

    @Test
    public void testGetMarker2() {
        player = new Player('X');
        assertNotEquals('O', player.getMarker());
    }

    @Test
    public void testConstructor_Positive() {
        player = new Player('O');
        assertEquals('O', player.getMarker());
    }

    @Test
    public void testConstructor_Negative() {
        player = new Player('O');
        assertNotEquals('X', player.getMarker());
    }
}