package cart;

import model.Product;
import promotion.Promotion;
import java.util.*;
import javax.swing.ProgressMonitorInputStream;

public class Cart {
    private final Map<Product, Integer> products;
    private final Promotion promotion;

    public Cart(Promotion promotion) {
        this.products = new HashMap<>();
        this.promotion = promotion;
    }

    public void addProduct(Product product) {
        products.put(product, products.getOrDefault(product, 0) + 1);
    }

    public void removeProduct(Product product) {
        if (products.containsKey(product)) {
            int count = products.get(product);
            if (count > 1) {
                products.put(product, count - 1);
            } else {
                products.remove(product);
            }
        }
    }

    public void displayCartContents() {
        if (products.isEmpty()) {
            System.out.println("Koszyk jest pusty.");
            return;
        }
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey().getName() + ", " + entry.getValue() + " szt.");
        }
    }

    public double getTotalPrice() {
        return promotion.getTotalPrice(products);
    }

    public void displayTotalPrice() {
        System.out.printf("Cena całkowita koszyka: %.2f PLN\n", getTotalPrice());
    }

}
