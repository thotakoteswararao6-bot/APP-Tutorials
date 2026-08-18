package tutorial_4;


import java.util.Scanner;
class Employee
{
    int empId;
    String name;
    double monthlySalary;
    double annualSalary;
    double bonus;
    void getData(Scanner sc)
    {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = sc.nextDouble();
    }
    void calculateAnnualSalary()
    {
        annualSalary = monthlySalary * 12;
    }
    void calculateBonus()
    {
        if(monthlySalary >= 30000)
            bonus = annualSalary * 0.10;
        else
            bonus = 0;
    }
    void display()
    {
        System.out.println("\nEmployee ID      : " + empId);
        System.out.println("Employee Name    : " + name);
        System.out.println("Monthly Salary   : " + monthlySalary);
        System.out.println("Annual Salary    : " + annualSalary);
        System.out.println("Bonus            : " + bonus);

        if(monthlySalary >= 30000)
            System.out.println("Eligibility      : Eligible");
        else
            System.out.println("Eligibility      : Not Eligible");
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee e[] = new Employee[5];
        for(int i = 0; i < 5; i++)
        {
            e[i] = new Employee();
            System.out.println("\nEnter Details of Employee " + (i + 1));
            e[i].getData(sc);
            e[i].calculateAnnualSalary();
            e[i].calculateBonus();
        }
        System.out.println("\n===== EMPLOYEE DETAILS =====");
        for(int i = 0; i < 5; i++)
        {
            e[i].display();
        }
        sc.close();
    }
}
