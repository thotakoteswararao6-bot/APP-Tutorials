package tutorial_7;

package student;
public class Student {
    private int id;
    private String name;
    private String department;
    public Student(int id,string name,string department)
    {
        this.id = id;
        this.name = name;
        this.department =department;
    }
    public void displaystudent() {
        System.out.println("student id:"+id);
        System.out.println("name:"+name);
        System.out.println("department:"+department);
    }
}
package course;
public class Course {
    private int courseid;
    private String courseName;
    private int credits;
    public Course(int courseId, string coursename,int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }
    public void displaycourse() {
        System.out.println("Course id:"+ courseid);
        System.out.println("Course Name:"+courseName);
        System.out.println("Credits:"+ credits);
    }
}
import student.Student;
import course.Course;
public class Main {
    public static void main(String[] args) {
        Student s= new Student(101, "Rahul", "CSE");
        Course c= new Course(201, "Java Programming", 4);
        System.out.println("Student details");
        s.displayStudent();
        System.out.println();
        System.out.println("course Details");
        c.displayCourse();
    }
}
