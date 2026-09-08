package tutorial_6;

package student;
public class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}
package course;
public class Course {
    int courseId;
    String courseName;
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
    }
}
import student.Student;
import course.Course;
public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        Course c = new Course(501, "Java Programming");
        s.display();
        System.out.println();
        c.display();
    }
}
