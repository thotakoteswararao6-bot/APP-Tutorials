package tutorial_2;

class Marks {
    int subject1;
    int subject2;
    int subject3;
    void calculate() {
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;
        System.out.println("Subject 1 Marks : " + subject1);
        System.out.println("Subject 2 Marks : " + subject2);
        System.out.println("Subject 3 Marks : " + subject3);
        System.out.println("Total Marks     : " + total);
        System.out.println("Average Marks   : " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.subject1 = 85;
        m.subject2 = 90;
        m.subject3 = 80;
        m.calculate();
    }
}
