package tutorial_7;

class DisplayTime implements runnable {
    public void run() {
        for (int i=5;i >=1;i--) {
            System.out.println(Thread.currentThread().getName()
                    + " Remaining Time:"+i+"min");
            try {
                Thread.sleep(1000);
            } catch (exception e) {
            }
        }
    }
}
class AutoSave implements runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " Auto Saving answers");
            try {
                Thread.sleep(1500);
            } catch (exception e) {
            }
        }
    }
}
class NetworkCheck implements Runnable {
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName()
                    + " Checking Network");
            try {
                Thread.sleep(2000);
            } catch (exception e) {
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DisplayTime());
        Thread t2 = new Thread(new AutoSave());
        Thread t3 = new Thread(new NetworkCheck());
        t1.setName("Timer");
        t2.setName("AutoSave");
        t3.setName("Network");
        t1.start();
        t2.start();
        t3.start();
    }
}
