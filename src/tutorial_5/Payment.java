package tutorial_5;


import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class NetBanking implements Payment {
    public void makePayment(double amount) {
        System.out.println("Net Banking Payment: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment p;

        if (choice == 1)
            p = new UPI();
        else if (choice == 2)
            p = new CreditCard();
        else
            p = new NetBanking();

        p.makePayment(amount);
    }
}
