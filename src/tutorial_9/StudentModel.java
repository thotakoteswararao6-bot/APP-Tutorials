package tutorial_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    static class StudentModel {
        private int total;
        private double average;
        private String grade;
        public void calculate(int m1,int m2,int m3) {
            total =m1+m2+m3;
            average=total/3.0;
            if (average >= 90)
                grade = "A";
            else if (average >= 75)
                grade = "B";
            else if (average >= 60)
                grade = "C";
            else if (average >= 50)
                grade = "D";
            else
                grade = "F";
        }
        public int getTotal() {
            return total;
        }
        public double getAverage() {
            return average;
        }
        public String getGrade() {
            return grade;
        }
    }
    static class StudentView extends JFrame {
        JTextField nameField = new JTextField(15);
        JTextField mark1Field = new JTextField(5);
        JTextField mark2Field = new JTextField(5);
        JTextField mark3Field = new JTextField(5);
        JButton button = new JButton("Calculate Result");
        StudentView() {
            setTitle("Student Grade Calculator");
            setSize(350, 300);
            setLayout(new FlowLayout());
            add(new JLabel("Student Name"));
            add(nameField);
            add(new JLabel("Mark 1"));
            add(mark1Field);
            add(new JLabel("Mark 2"));
            add(mark2Field);
            add(new JLabel("Mark 3"));
            add(mark3Field);
            add(button);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
    static class StudentController implements ActionListener {
        StudentModel model;
        StudentView view;
        Studentcontroller(StudentModel m,StudentView v) {
            model=m;
            view=v;
            view.button.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e) {
            try {
                String name=view.nameField.getText();
                int m1=Integer.parseInt(view.mark1Field.getText());
                int m2=Integer.parseInt(view.mark2Field.getText());
                int m3=Integer.parseInt(view.mark3Field.getText());
                model.calculate(m1,m2,m3);
                JOptionPane.showMessageDialog(view,"Student name:"+name +"\nTotal:"+ model.getTotal()+"\nAverage:"+model.getAverage() +"\nGrade:" + model.getGrade());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view,"Enter valid marks.");
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentModel model=new StudentModel();
                StudentView view=new StudentView();
                new StudentController(model, view);
            }
        });
    }
}
