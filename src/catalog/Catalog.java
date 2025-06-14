package catalog;

import java.util.List;
import model.Product;

public final class Catalog {
    private final List<Product> products;

    public Catalog() {
        this.products = List.of(
                new Product(1, "Headphones", 120.0, "Electronics", true),
                new Product(2, "Smartwatch", 600.0, "Electronics", true),
                new Product(3, "T-shirt", 50.0, "Clothing", true),
                new Product(4, "Sweater", 80.0, "Clothing", false),
                new Product(5, "Orange", 2.5, "Food", true),
                new Product(6, "Carrot", 1.0, "Food", true),
                new Product(7, "Bluetooth Speaker", 150.0, "Electronics", true),
                new Product(8, "Gaming Console", 2500.0, "Electronics", false),
                new Product(9, "Shoes", 300.0, "Clothing", true),
                new Product(10, "Bread", 2.0, "Food", true)
        );
    }

    public void displayCatalogProductsAlphabetically() {
        List<Product> sortedProducts = ProductSorter.sortAlphabetically(products);
        ProductDisplay.displayProductsWithPrices(sortedProducts);
        System.out.println();
    }

    public void displayAvailableProductsByCategory(String category) {
        List<Product> filteredProducts = ProductFilter.filterByCategoryAndAvailability(products, category);

        if (filteredProducts.isEmpty()) {
            System.out.println("No available products found in the \"" + category + "\" category.");
        } else {
            List<Product> sortedByPrice = ProductSorter.sortByPrice(filteredProducts);
            System.out.println("Available products in \"" + category + "\" category:");
            ProductDisplay.displayProductsWithPrices(sortedByPrice);
        }
        System.out.println();
    }

    public List<Product> getProducts() {
        return products;
    }
}