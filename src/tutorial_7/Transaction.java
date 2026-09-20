package tutorial_7;

class Transaction implements Runnable {
    public void run() {
        for (int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName()
                    + "Processing Transaction"+i);
            try {
                Thread.sleep(1000);
            } catch (exception e) {
            }
        }
    }
}
class BalanceUpdate implements Runnable {
    public void run() {
        for (int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName()+"Updating Balance"+i);
            try {
                Thread.sleep(1500);
            } catch (exception e) {
            }
        }
    }
}
class SMSNotification implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " Sending SMS " + i);
            try {
                Thread.sleep(2000);
            } catch (exception e) {
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Transaction());
        Thread t2 = new Thread(new Balanceupdate());
        Thread t3 = new Thread(new SMSNotification());
        t1.setName("Transaction");
        t2.setName("Balance");
        t3.setName("SMS");
        t1.start();
        t2.start();
        t3.start();
    }
}
