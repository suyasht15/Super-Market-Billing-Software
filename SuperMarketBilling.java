import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SuperMarketBilling {
    
    // Inner class to represent an item in the bill
    static class Item {
        String name;
        double price;
        int quantity;
        
        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        
        public double totalPrice() {
            return price * quantity;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        System.out.println("Welcome to Super Market Billing Software!");
        
        // Loop to add multiple items
        boolean moreItems = true;
        while (moreItems) {
            System.out.print("\nEnter item name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter price per unit: Rs");
            double price = scanner.nextDouble();
            
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left-over
            
            // Add the item to the list
            items.add(new Item(name, price, quantity));
            
            // Ask if the user wants to add another item
            System.out.print("Do you want to add another item? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                moreItems = false;
            }
        }
        
        // Calculate subtotal, tax, and total
        double subtotal = 0.0;
        for (Item item : items) {
            subtotal += item.totalPrice();
        }
        double taxRate = 0.18; // 18% tax
        double taxAmount = subtotal * taxRate;
        double total = subtotal + taxAmount;
        
        // Print the final bill
        System.out.println("\n---------------------------------");
        System.out.println("         Super Market Bill       ");
        System.out.println("---------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Item", "Price", "Quantity", "Total");
        for (Item item : items) {
            System.out.printf("%-15s Rs%-9.2f %-10d Rs%-10.2f%n", 
                              item.name, item.price, item.quantity, item.totalPrice());
        }
        System.out.println("---------------------------------");
        System.out.printf("Subtotal: Rs%.2f%n", subtotal);
        System.out.printf("Tax (18%%): Rs%.2f%n", taxAmount);
        System.out.printf("Total: Rs%.2f%n", total);
        System.out.println("---------------------------------");
        
        scanner.close();
    }
}