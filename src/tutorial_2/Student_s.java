package tutorial_2;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 18;
        Student s2 = new Student();
        s2.name = "Priya";
        s2.age = 19;
        System.out.println("----- Student 1 Details -----");
        s1.display();
        System.out.println("\n----- Student 2 Details -----");
        s2.display();
    }
}
