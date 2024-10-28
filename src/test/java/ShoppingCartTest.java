import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }
    @Test
    @DisplayName("returns items in the cart when added to the cart")
    void testAddShoppingItems() {
        cart.addShoppingItems("peanuts", 0.90);
        cart.addShoppingItems("almonds",1.70);
        assertEquals(2,cart.getItemsInCart().size());
    }

    @Test
    @DisplayName("returns total cost of the items, when there are items in the cart")
    void testCalculateCartPrice() {
        cart.addShoppingItems("peanuts", 0.90);
        cart.addShoppingItems("almonds",1.70);
        Double totalPrice = cart.calculateCartPrice();
        assertEquals(2.60,totalPrice);
    }


    @Test
    @DisplayName("returns discounted price of the cart when valid discount is applied")
    public void testApplyDiscount() {
        cart.addShoppingItems("Apple", 0.99);
        cart.addShoppingItems("Banana", 0.49);

        cart.setDiscount(0.1); // 10%
        assertEquals((1.48 * (1-0.1)), cart.calculateCartPrice()); // Check total after discount

        // Test edge case of discount application
        cart.setDiscount(0.0); // 0% discount
        assertEquals((1.48), cart.calculateCartPrice());

        cart.setDiscount(1.0); // 100% discount
        assertEquals(0.0, cart.calculateCartPrice());
    }


    @Test
    @DisplayName("throws exception if invalid discount is supplied")
    public void testApplyDiscountInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> cart.setDiscount(-0.1)); // Below 0
        assertThrows(IllegalArgumentException.class, () -> cart.setDiscount(1.1)); // Above 1
    }

}