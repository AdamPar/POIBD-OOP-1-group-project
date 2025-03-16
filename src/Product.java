public class Product {
    private final int id;
    private String name;
    private double price;
    private String category;
    private boolean isAvailable;

    public Product(int id, String name, double price, String category, boolean isAvailable) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0.");
        }
        this.id = id;
        setName(name);
        setPrice(price);
        setCategory(category);
        this.isAvailable = isAvailable;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be empty.");
        }

        // TODO: Add future validation for allowed (fixed set) categories
        // List<String> validCategories = Arrays.asList("Electronics", "Clothing", "Food");
        // if (!validCategories.contains(category)) {
        //    throw new IllegalArgumentException("Invalid category.");
        // }

        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void printProductInfo() {
        System.out.println("Id: " + id);
        System.out.println("Product: " + name);
        System.out.println("Price: " + price + " PLN");
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
    }
}