import catalog.Catalog;

public class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        catalog.displayCatalogProductsAlphabetically();

        catalog.displayAvailableProductsByCategory("Electronics");

        catalog.displayAvailableProductsByCategory("Clothing");
    }
}