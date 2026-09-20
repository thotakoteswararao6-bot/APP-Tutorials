package tutorial_7;

class Junction extends Thread {
    private String status;
    private int delay;
    public Junction(String status, int delay) {
        this.status = status;
        this.delay = delay;
    }
    public void run() {
        for (int i=1;i<=3;i++) {
            System.out.println(getName()+ " Traffic Status : "+ status);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Junction j1 = new Junction("Heavy Traffic", 1000);
        Junction j2 = new Junction("Moderate Traffic", 1500);
        Junction j3 = new Junction("Low Traffic", 2000);
        j1.setName("Junction-1");
        j2.setName("Junction-2");
        j3.setName("Junction-3");
        j1.start();
        j2.start();
        j3.start();
    }
}
