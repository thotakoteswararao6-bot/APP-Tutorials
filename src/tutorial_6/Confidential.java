package tutorial_6;

interface Confidential {
}
class Report implements Confidential {
    void show() {
        System.out.println("Confidential Report");
    }
}
class Notice {
    void show() {
        System.out.println("General Notice");
    }
}
public class Main {
    public static void main(String[] args) {
        Report r = new Report();
        Notice n = new Notice();
        if (r instanceof Confidential)
            System.out.println("Report is Confidential");
        if (!(n instanceof Confidential))
            System.out.println("Notice is Not Confidential");
    }
}

