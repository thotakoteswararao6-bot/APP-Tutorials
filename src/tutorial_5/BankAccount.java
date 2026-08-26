package tutorial_5;

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "ANU", 5000);

        b.deposit(2000);
        b.withdraw(1000);

        b.display();
    }
}
