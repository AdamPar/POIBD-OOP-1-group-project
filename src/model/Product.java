package model;

import utils.ValidationUtils;

public final class Product {
    private final int id;
    private String name;
    private double price;
    private String category;
    private boolean isAvailable;

    public Product(int id, String name, double price, String category, boolean isAvailable) {
        ValidationUtils.validateId(id);
        this.id = id;
        setName(name);
        setPrice(price);
        setCategory(category);
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ValidationUtils.validateString(name, "Name");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        ValidationUtils.validatePrice(price);
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        ValidationUtils.validateString(category, "Category");
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
