package catalog;

import model.Product;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProductSorter {
    public static List<Product> sortAlphabetically(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    public static List<Product> sortByPrice(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }
}
