import cart.Cart;
import catalog.Catalog;
import model.Product;
import promotion.Promotion;
import promotion.Promotion.PromotionEnum;

public class Main {
    public static void main(String[] args) {

        Promotion promotion = new Promotion(PromotionEnum.NONE);
        Catalog catalog = new Catalog();
        Cart cart = new Cart(promotion);

        catalog.displayCatalogProductsAlphabetically();

        catalog.displayAvailableProductsByCategory("Electronics");

        catalog.displayAvailableProductsByCategory("Clothing");

        Product headphones = catalog.getProducts().get(0);
        Product smartwatch = catalog.getProducts().get(1);
        Product tshirt = catalog.getProducts().get(2);

        cart.addProduct(headphones);
        cart.addProduct(headphones);
        cart.addProduct(headphones);
        cart.addProduct(smartwatch);
        cart.addProduct(tshirt);

        cart.removeProduct(headphones);

        System.out.println("\nCart contents:");
        cart.displayCartContents();
        cart.displayTotalPrice();
    }
}