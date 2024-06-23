import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testGetMarker_Positive() {
        Player player = new Player('X');
        assertEquals('X', player.getMarker());  // Testet, ob der Marker korrekt zurückgegeben wird
    }

    @Test
    public void testGetMarker_Negative() {
        Player player = new Player('X');
        assertNotEquals('O', player.getMarker());  // Testet, ob der Marker nicht falsch ist
    }

    @Test
    public void testConstructor_Positive() {
        Player player = new Player('O');
        assertEquals('O', player.getMarker());  // Testet, ob der Konstruktor den Marker korrekt setzt
    }

    @Test
    public void testConstructor_Negative() {
        Player player = new Player('O');
        assertNotEquals('X', player.getMarker());  // Testet, ob der Konstruktor den Marker nicht falsch setzt
    }
}