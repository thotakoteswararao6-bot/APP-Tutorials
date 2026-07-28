package tutorial_1;

public class StudentInfo {
    public static void main(String[] args) {
        String name = "John Doe";
        String registerNumber = "CSE12345";
        String department = "Computer Science";
        int yearOfStudy = 2;
        String collegeName = "ABC College of Engineering";
        System.out.println("===== Student Information =====");
        System.out.printf("%-15s: %s%n", "Name", name);
        System.out.printf("%-15s: %s%n", "Register Number", registerNumber);
        System.out.printf("%-15s: %s%n", "Department", department);
        System.out.printf("%-15s: %d%n", "Year of Study", yearOfStudy);
        System.out.printf("%-15s: %s%n", "College Name", collegeName);
    }
}