import java.util.*;

public class Catalog {
    private final List<Product> products; // currently immutable, no possibility to add / delete products

    public Catalog() {
        this.products = new ArrayList<>();
        // hardcoded products
        products.add(new Product(1, "Headphones", 120.0, "Electronics", true));
        products.add(new Product(2, "Smartwatch", 600.0, "Electronics", true));
        products.add(new Product(3, "T-shirt", 50.0, "Clothing", true));
        products.add(new Product(4, "Sweater", 80.0, "Clothing", false));
        products.add(new Product(5, "Orange", 2.5, "Food", true));
        products.add(new Product(6, "Carrot", 1.0, "Food", true));
        products.add(new Product(7, "Bluetooth Speaker", 150.0, "Electronics", true));
        products.add(new Product(8, "Gaming Console", 2500.0, "Electronics", false));
        products.add(new Product(9, "Shoes", 300.0, "Clothing", true));
        products.add(new Product(10, "Bread", 2.0, "Food", true));
    }

    public void displayCatalogProductsAlphabetically() {
        if (products.isEmpty()) {
            System.out.println("No products available in the catalog.");
        } else {
            System.out.println("Catalog sorted alphabetically.");
            products.stream()
                    .sorted(Comparator.comparing(Product::getName))
                    .forEach(product -> System.out.println("Product: " + product.getName() + ", price: " + product.getPrice() + " PLN"));
        }
        System.out.println();
    }

    public void displayAvailableProductsByCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            System.out.println("Invalid category. Please provide a valid category.");
        } else {
            List<Product> filteredProducts = products.stream()
                    .filter(product -> product.getCategory().equalsIgnoreCase(category) && product.isAvailable())
                    .sorted(Comparator.comparing(Product::getPrice))
                    .toList();

            if (filteredProducts.isEmpty()) {
                System.out.println("No available products found in the \"" + category + "\" category.");
            } else {
                System.out.println("Available products in \"" + category + "\" category.");
                filteredProducts.forEach(product -> System.out.println("Product: " + product.getName() + ", price: " + product.getPrice() + " PLN"));
            }
        }
        System.out.println();
    }

}
