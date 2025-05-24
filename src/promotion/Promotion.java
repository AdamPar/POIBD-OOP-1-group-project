package promotion;

import java.util.*;
import model.Product;

public class Promotion {
    public enum PromotionEnum {
        NONE,
        PERCENTAGE_DISCOUNT,
        CHEAPEST_FOR_ONE_ZLOTY,
        SECOND_HALF_PRICE
    }

    public PromotionEnum currentPromotion;

    public Promotion(PromotionEnum promotion) {
        this.currentPromotion = promotion;
    }
    
    public double getTotalPrice(Map<Product, Integer> products) {
        double total = 0.0;
        switch (currentPromotion) {
            case PERCENTAGE_DISCOUNT:
                for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                    total += entry.getKey().getPrice() * entry.getValue();
                }
                total *= 0.9;
                break;
            case CHEAPEST_FOR_ONE_ZLOTY:
                List<Map.Entry<Product, Integer>> productList = new ArrayList<>(products.entrySet());
                productList.sort(Comparator.comparingDouble(entry -> entry.getKey().getPrice()));

                int productsForOneZloty = productList.size() / 3;

                for (int i = 0; i < productsForOneZloty; i++) {
                    total += 1.0;
                    productList.remove(i);
                }

                for (Map.Entry<Product, Integer> entry : productList) {
                    total += entry.getKey().getPrice() * entry.getValue();
                }
                break;
            case SECOND_HALF_PRICE:
                for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                    int count = entry.getValue();
                    double price = entry.getKey().getPrice();
                    int pairs = count / 2;
                    int singles = count % 2;
                    total += pairs * (price + price * 0.5); // one full, one half
                    total += singles * price;
                }
                break;
            case NONE:
            default:
                for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                    total += entry.getKey().getPrice() * entry.getValue();
                }
        }
        return total;
    }
}