package catalog;

import model.Product;
import utils.ValidationUtils;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;

public class ProductSorter {
    public static List<Product> sortAlphabetically(List<Product> products) {
        ValidationUtils.validateList(products, "Product list");

        if (products.isEmpty()) {
            return Collections.emptyList();
        }

        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    public static List<Product> sortByPrice(List<Product> products) {
        ValidationUtils.validateList(products, "Product list");

        if (products.isEmpty()) {
            return Collections.emptyList();
        }

        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }
}