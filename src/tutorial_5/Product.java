package tutorial_5;


abstract class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;

        System.out.println(name);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}

class Electronics extends Product {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Books(3, "Java Book", 1000);

        p1.display();
        p2.display();
        p3.display();
    }
}
