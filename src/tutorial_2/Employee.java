package tutorial_2;

class Employee {
    int id;
    String name;
    double salary;
    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Rahul";
        e1.salary = 50000;
        Employee e2 = new Employee();
        e2.id = 102;
        e2.name = "Priya";
        e2.salary = 60000;
        System.out.println("----- Employee 1 Details -----");
        e1.display();
        System.out.println("\n----- Employee 2 Details -----");
        e2.display();
    }
}
