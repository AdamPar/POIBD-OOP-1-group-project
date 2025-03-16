package catalog;

import model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    public static List<Product> filterByCategoryAndAvailability(List<Product> products, String category) {
        return products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category) && product.isAvailable())
                .collect(Collectors.toList());
    }
}
