package shopCart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    @Test
    void testAddItem() {
        Cart cart = new Cart("Adesuwa");
        assertEquals(1, cart.items.size());
        Item item = new Item("Fish", 800, 2);
        //cart;

    }

}