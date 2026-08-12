package tutorial_3;


import java.util.Scanner;
class Student
{
    int rollNo;
    String name;
    int marks[] = new int[3];
    double attendance;
    int total = 0;
    double average;
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[5];
        double highestAverage = 0;
        int highestIndex = 0;ll
        for(int i = 0; i < 5; i++)
        {
            s[i] = new Student();
            System.out.println("\nEnter Details of Student " + (i + 1));
            System.out.print("Enter Roll Number: ");
            s[i].rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            s[i].name = sc.nextLine();
            s[i].total = 0;
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Enter Marks in Subject " + (j + 1) + ": ");
                s[i].marks[j] = sc.nextInt();
                s[i].total += s[i].marks[j];
            }
            System.out.print("Enter Attendance Percentage: ");
            s[i].attendance = sc.nextDouble();
            s[i].average = s[i].total / 3.0;
            if(s[i].average > highestAverage)
            {
                highestAverage = s[i].average;
                highestIndex = i;
            }
        }
        System.out.println("\n========== STUDENT PERFORMANCE ==========");
        for(int i = 0; i < 5; i++)
        {
            String result = (s[i].average >= 50) ? "Pass" : "Fail";
            String scholarship = (s[i].average >= 75 && s[i].attendance >= 80)
                    ? "Eligible"
                    : "Not Eligible";
            String performance = (s[i].average >= 85)
                    ? "Excellent"
                    : "Good";
            System.out.println("\nRoll Number : " + s[i].rollNo);
            System.out.println("Name        : " + s[i].name);
            System.out.println("Total Marks : " + s[i].total);
            System.out.println("Average     : " + s[i].average);
            System.out.println("Attendance  : " + s[i].attendance + "%");
            System.out.println("Result      : " + result);
            System.out.println("Scholarship : " + scholarship);
            System.out.println("Performance : " + performance);
        }
        System.out.println("\n===== Student with Highest Average =====");
        System.out.println("Roll Number : " + s[highestIndex].rollNo);
        System.out.println("Name        : " + s[highestIndex].name);
        System.out.println("Average     : " + s[highestIndex].average);
        sc.close();
    }
}
