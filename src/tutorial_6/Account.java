package tutorial_6;

class Account {
    int accountNo;
    String holderName;
    Account(int accountNo, String holderName) {
        this.accountNo = accountNo;
        this.holderName = holderName;
    }
    void displayDetails() {
        System.out.println(accountNo + " " + holderName);
    }
}
class SavingsAccount extends Account {
    SavingsAccount(int accountNo, String holderName) {
        super(accountNo, holderName);
    }
    @Override
    void displayDetails() {
        System.out.println("Savings Account");
        super.displayDetails();
    }
}
interface Payment {
    void pay(double amount);
}
interface SecurePayment extends Payment {
    void verifyPayment();
}
interface OnlineTransaction {
}
class UPIPayment implements SecurePayment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("UPI Payment: Rs." + amount);
    }
    public void verifyPayment() {
        System.out.println("UPI Verified");
    }
}
class CardPayment implements Payment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Card Payment: Rs." + amount);
    }
}
public class Main {
    public static void main(String[] args) {
        Account a;
        a = new SavingsAccount(1001, "Ravi");
        a.displayDetails();
        System.out.println();
        a = new CurrentAccount(2001, "Priya");
        a.displayDetails();
        System.out.println();
        UPIPayment upi = new UPIPayment();
        upi.verifyPayment();
        upi.pay(5000);
        System.out.println();
        CardPayment card = new CardPayment();
        card.pay(2500);
        if (upi instanceof OnlineTransaction)
            System.out.println("UPI is an Online Transaction");
        if (card instanceof OnlineTransaction)
            System.out.println("Card Payment is an Online Transaction");
    }
}
