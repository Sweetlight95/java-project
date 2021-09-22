package shopCart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    public void testCalculateTotal() {
        Item item = new Item("Sandal", 500, 1);
        assertEquals(500, item.calculateTotal());
    }

    @Test
    public void testToString() {
        Item item = new Item("Sandal", 500, 1);
        String expected = "Sandal" + "\t\t\t" + "500.0" + "\t\t" + "1" + "\t\t" + "500.0";
        assertEquals(item.toString(), expected);
        System.out.println(item);
    }
}