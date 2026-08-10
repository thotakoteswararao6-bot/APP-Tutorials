package tutorial_2;

class Students {
    String name;
    int rollNumber;
    void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.rollNumber = 101;

        s.display();
    }
}
