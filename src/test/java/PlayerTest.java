import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testGetMarkerPositive() {
        Player player = new Player('X');
        assertEquals('X', player.getMarker());  // Testet, ob der Marker korrekt zurückgegeben wird
    }

    @Test
    public void testGetMarkerNegative() {
        Player player = new Player('X');
        assertNotEquals('O', player.getMarker());  // Testet, ob der Marker nicht falsch ist
    }

    @Test
    public void testConstructorPositive() {
        Player player = new Player('O');
        assertEquals('O', player.getMarker());  // Testet, ob der Konstruktor den Marker korrekt setzt
    }

    @Test
    public void testConstructorNegative() {
        Player player = new Player('O');
        assertNotEquals('X', player.getMarker());  // Testet, ob der Konstruktor den Marker nicht falsch setzt
    }
}