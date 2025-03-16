package utils;

import java.util.List;

public class ValidationUtils {

    public static <T> void validateList(List<T> list, String listName) {
        if (list == null) {
            throw new IllegalArgumentException(listName + " cannot be null.");
        }
    }

    public static void validateString(String str, String fieldName) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty.");
        }
    }

    public static void validateId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0.");
        }
    }

    public static void validatePrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
    }
}
