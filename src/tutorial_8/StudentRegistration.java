package tutorial_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentRegistration extends JFrame implements ActionListener
{
    JTextField name, regno;
    JRadioButton male, female;
    JComboBox<String> department;
    JButton submit;
    StudentRegistration()
    {
        setTitle("Student Registration");
        setSize(400,400);
        setLayout(new FlowLayout());
        JLabel n=new JLabel("Student Name:");
        name=new JTextField(20);
        JLabel r=new JLabel("Register Number:");
        regno=new JTextField(20);
        JLabel g=new JLabel("Gender:");
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        JLabel d=new JLabel("Department:");
        String dep[]={"CSE","Cyber security","ECE","EEE","Mechanical"};
        department=new JComboBox<String>(dep);
        submit=new JButton("Submit");
        add(n);
        add(name);
        add(r);
        add(regno);
        add(g);
        add(male);
        add(female);
        add(d);
        add(department);
        add(submit);
        submit.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String gender="";
        if(male.isSelected())
        {
            gender="Male";
        }
        else if(female.isSelected())
        {
            gender="Female";
        }
        String details="Student Name : "+name.getText()+"\nRegister No : "+regno.getText()+"\nGender : "+gender+ "\nDepartment : "+department.getSelectedItem();
        JoptionPane.showMessageDialog(this,details);
    }
    public static void main(String args[])
    {
        new StudentRegistration();
    }
}
