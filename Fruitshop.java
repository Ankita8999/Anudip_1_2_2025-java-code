package project1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Fruitshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = scanner.nextDouble();

        // Define fruit prices for weekdays
        Map<String, Double> weekdayPrices = new HashMap<>();
        weekdayPrices.put("banana", 2.50);
        weekdayPrices.put("apple", 1.20);
        weekdayPrices.put("orange", 0.85);
        weekdayPrices.put("grapefruit", 1.45);
        weekdayPrices.put("kiwi", 2.70);
        weekdayPrices.put("pineapple", 5.50);
        weekdayPrices.put("grapes", 3.85);

        // Define fruit prices for weekends
        Map<String, Double> weekendPrices = new HashMap<>();
        weekendPrices.put("banana", 2.70);
        weekendPrices.put("apple", 1.25);
        weekendPrices.put("orange", 0.90);
        weekendPrices.put("grapefruit", 1.60);
        weekendPrices.put("kiwi", 3.00);
        weekendPrices.put("pineapple", 5.60);
        weekendPrices.put("grapes", 4.20);

        // Valid days
        String[] weekdays = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        String[] weekends = {"saturday", "sunday"};

        double price = 0.0;
        boolean validDay = false;

        // Determine price based on the day
        if (isInArray(day, weekdays)) {
            validDay = true;
            if (weekdayPrices.containsKey(fruit)) {
                price = weekdayPrices.get(fruit) * quantity;
            } else {
                System.out.println("error");
                return;
            }
        } else if (isInArray(day, weekends)) {
            validDay = true;
            if (weekendPrices.containsKey(fruit)) {
                price = weekendPrices.get(fruit) * quantity;
            } else {
                System.out.println("error");
                return;
            }
        }

        // Output result
        if (!validDay) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f%n", price);
        }

        scanner.close();
    }

    private static boolean isInArray(String value, String[] array) {
        for (String item : array) {
            if (item.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
