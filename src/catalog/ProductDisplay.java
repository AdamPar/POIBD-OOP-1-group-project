package catalog;

import model.Product;
import utils.ValidationUtils;

import java.util.List;

public class ProductDisplay {
    public static void displayProductsWithPrices(List<Product> products) {
        ValidationUtils.validateList(products, "Product list");

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        products.forEach(product ->
                System.out.println("Product: " + product.getName() + ", price: " + product.getPrice() + " PLN"));
    }
}
