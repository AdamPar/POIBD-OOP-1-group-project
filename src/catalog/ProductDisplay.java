package catalog;

import model.Product;

import java.util.List;

public class ProductDisplay {
    public static void displayProductsWithPrices(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            products.forEach(product ->
                    System.out.println("model.Product: " + product.getName() + ", price: " + product.getPrice() + " PLN"));
        }
    }
}
