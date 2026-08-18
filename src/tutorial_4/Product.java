package tutorial_4;

import java.util.Scanner;
class Product {
    int id;
    String name;
    double price;
    int quantity;
    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalPrice() {
        return price * quantity;
    }
    double getDiscount(double totalPrice) {
        if (totalPrice >= 5000) {
            return totalPrice * 0.10;
        } else {
            return totalPrice * 0.05;
        }
    }
    double getFinalPrice(double totalPrice, double discount) {
        return totalPrice - discount;
    }
    void display() {
        double totalPrice = getTotalPrice();
        double discount = getDiscount(totalPrice);
        double finalPrice = getFinalPrice(totalPrice, discount);
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("-----------------------------------");
    }
}
public class ProductBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            products[i] = new Product(id, name, price, quantity);
        }
        System.out.println("\n===== Product Billing Details =====");
        for (Product p : products) {
            p.display();
        }
        sc.close();
    }
}
