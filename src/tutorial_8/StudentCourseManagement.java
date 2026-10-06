package tutorial_8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
public class StudentCourseManagement extends JFrame implements ActionListener
{
    JList<String> courseList;
    JTable table;
    DefaultTableModel model;
    JButton add, remove;
    StudentCourseManagement()
    {
        setTitle("Student Course Management");
        setSize(600,400);
        setLayout(new BorderLayout());
        String courses[]={"Java Programming","Data Structures","Database Management","Operating System","Computer Networks"
        };
        courseList=new JList<String>(courses);
        JScrollPane listScroll=new JScrollPane(courseList);
        model=new DefaultTableModel();
        model.addColumn("Student Name");
        model.addColumn("Course");
        model.addColumn("Status");
        table=new JTable(model);
        JScrollPane tableScroll=new JScrollPane(table);
        add=new JButton("Add Course");
        remove=new JButton("Remove Course");
        JPanel panel=new JPanel();
        panel.add(add);
        panel.add(remove);
        add(listScroll,BorderLayout.WEST);
        add(tableScroll,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);
        add.addActionListener(this);
        remove.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==add)
        {
            String course=courseList.getSelectedValue();
            if(course!=null)
            {
                model.addRow(new Object[]{"Student",course,"Enrolled"});
            }
        }
        if(e.getSource()==remove)
        {
            int row=table.getSelectedRow();
            if(row!=-1)
            {
                model.removeRow(row);
            }
        }
    }
    public static void main(String args[])
    {
        new Studentcoursemanagement();
    }
}

