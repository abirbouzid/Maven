package bmt;

import java.util.Scanner;

public class FoodTaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Food Taster!");
        System.out.println("Please rate the taste of the following food items (on a scale of 1 to 5):");

        String[] foodItems = {"Pizza", "Sushi", "Burger", "Salad"};
        int[] ratings = new int[foodItems.length];

        for (int i = 0; i < foodItems.length; i++) {
            System.out.print(foodItems[i] + ": ");
            ratings[i] = scanner.nextInt();
        }

        System.out.println("\nThank you for your ratings!");
        System.out.println("Here are the average ratings:");

        double totalRating = 0;
        for (int rating : ratings) {
            totalRating += rating;
        }

        double averageRating = totalRating / ratings.length;
        System.out.println("Average Rating: " + averageRating);
    }
}

