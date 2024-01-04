package Tshirt;

import java.util.ArrayList;

public class order {
    private String name;
    private String phoneNumber;
    private ArrayList<Integer> items;
    private ArrayList<Double> prices;

    public order(String name, String phoneNumber, ArrayList<Integer> items, ArrayList<Double> prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }

    // Getters and setters as needed
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to print the bill with VAT and total price
    public void generateBill() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        double vat = total * 0.13;
        double totalPriceWithVAT = total + vat;

        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Items: " + items);
        System.out.println("Price: " + prices);
        System.out.printf("Total Price (incl. VAT 13%%): %.2f%n", totalPriceWithVAT);
    }
}
