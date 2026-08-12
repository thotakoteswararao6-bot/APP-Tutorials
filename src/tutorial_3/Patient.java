package tutorial_3;

import java.util.Scanner;
class Patient
{
    String name;
    double fee;
    double discount;
    double finalAmount;
    Patient(String n, double f)
    {
        name = n;
        fee = f;
    }
    void calculateBill(double consultationFee)
    {
        if(consultationFee >= 2000)
            discount = consultationFee * 0.10;
        else
            discount = consultationFee * 0.05;
        finalAmount = consultationFee - discount;
    }
    void display()
    {
        System.out.println("\nPatient Name           : " + name);
        System.out.println("Consultation Fee       : " + fee);
        System.out.println("Discount               : " + discount);
        System.out.println("Final Amount           : " + finalAmount);
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Patient p[] = new Patient[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nEnter Details of Patient " + (i + 1));
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();
            p[i] = new Patient(name, fee);
            p[i].calculateBill(fee);
        }
        System.out.println("\n===== HOSPITAL BILLING DETAILS =====");
        for(int i = 0; i < 5; i++)
        {
            p[i].display();
        }
        sc.close();
    }
}
