import cart.Cart;
import model.Product;
import promotion.Promotion;
import promotion.Promotion.PromotionEnum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void shouldCalculateTotalPrice() {

        Promotion promotion = new Promotion(PromotionEnum.NONE);
        Cart cart = new Cart(promotion);
        Product book = new Product(1, "Book", 30.0, "Books", true);
        Product pen = new Product(2, "Pen", 5.0, "Stationery", true);

        cart.addProduct(book);
        cart.addProduct(book);  // 2 books
        cart.addProduct(pen);   // 1 pen

        double expectedTotal = 2 * book.getPrice() + pen.getPrice();
        assertEquals(expectedTotal, cart.getTotalPrice(), 0.001);
    }

    @Test
    void shouldRemoveProductFromCart() {

        Promotion promotion = new Promotion(PromotionEnum.NONE);
        Cart cart = new Cart(promotion);
        Product apple = new Product(3, "Apple", 2.0, "Food", true);

        cart.addProduct(apple);
        cart.addProduct(apple); // 2 apples
        cart.removeProduct(apple); // remove 1

        double expectedTotal = 1 * apple.getPrice(); // only 1 left
        assertEquals(expectedTotal, cart.getTotalPrice(), 0.001);
    }

    @Test
    void shouldAddProductToCart() {

        Promotion promotion = new Promotion(PromotionEnum.NONE);
        Cart cart = new Cart(promotion);
        Product book = new Product(1, "Book", 30.0, "Books", true);

        cart.addProduct(book);
        double expectedTotal = 1 * book.getPrice();
        assertEquals(expectedTotal, cart.getTotalPrice(), 0.001);
    }

}