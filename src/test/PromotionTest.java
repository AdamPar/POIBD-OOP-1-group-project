import cart.Cart;
import model.Product;
import promotion.Promotion;
import promotion.Promotion.PromotionEnum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PromotionTest {
    @Test
    void shouldCalculatePriceWithoutAnyPromotion() {
        Promotion promotion = new Promotion(PromotionEnum.NONE);
        Cart cart = new Cart(promotion);

        cart.addProduct(new Product(1, "Book", 30.0, "Books", true));
        cart.addProduct(new Product(2, "Pen", 10.0, "Stationery", true));

        assertEquals(40.0, cart.getTotalPrice(), 0.01);
    }

    @Test
    void shouldApplyTenPercentDiscount() {
        Promotion promotion = new Promotion(PromotionEnum.PERCENTAGE_DISCOUNT);
        Cart cart = new Cart(promotion);

        cart.addProduct(new Product(1, "Keyboard", 200.0, "Electronics", true));
        cart.addProduct(new Product(2, "Mouse", 100.0, "Electronics", true));

        assertEquals(270.0, cart.getTotalPrice(), 0.01); // 300 * 0.9
    }


    @Test
    void shouldApplySecondHalfPricePromotion() {
        Promotion promotion = new Promotion(PromotionEnum.SECOND_HALF_PRICE);
        Cart cart = new Cart(promotion);

        Product item = new Product(1, "T-shirt", 30.0, "T-shirts", true);
        cart.addProduct(item);
        cart.addProduct(item);
        cart.addProduct(item);

        // 30 (full) + 15 (half) + 30 (full) = 75
        assertEquals(75.0, cart.getTotalPrice(), 0.01);
    }
}
