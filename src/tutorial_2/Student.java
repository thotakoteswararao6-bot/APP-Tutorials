package tutorial_2;

import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    String department;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }
    void displayDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department : " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.displayDetails();
    }
}

