package tutorial_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main
{
    static class Model
    {
        String pass="admin123";
        String id,name,dept;
        boolean login(String u,String p)
        {
            return u.equals("admin") && p.equals(pass);
        }
        void addEmployee(String i,String n,String d)
        {
            id=i;
            name=n;
            dept=d;
        }
        String viewEmployee()
        {
            return "ID: "+id+"\nName: "+name+"\nDepartment: "+dept;
        }
        boolean change(String old,String n,String c)
        {
            if(pass.equals(old)&&n.equals(c))
            {
                pass=n;
                return true;
            }
            return false;
        }
    }
    static class Login extends JFrame
    {
        JTextField user=new JTextField(15);
        JPasswordField pass=new JPasswordField(15);
        JButton btn=new JButton("Login");
        Login()
        {
            setTitle("Login");
            setSize(250,200);
            setLayout(new FlowLayout());
            add(new JLabel("Username"));
            add(user);
            add(new JLabel("Password"));
            add(pass);
            add(btn);
            setVisible(true);
            setDefaultCloseOperation(3);
        }
    }
    static class Home extends JFrame
    {
        JMenuItem add,view,change,logout,exit;
        Home()
        {
            setTitle("Employee Portal");
            setSize(400,300);
            JMenuBar mb=new JMenuBar();
            JMenu e=new JMenu("Employee");
            JMenu t=new JMenu("Tools");
            JMenu x=new JMenu("Exit");
            add=new JMenuItem("Add Employee");
            view=new JMenuItem("View Employee");
            change=new JMenuItem("Change Password");
            logout=new JMenuItem("Logout");
            exit=new JMenuItem("Exit");
            e.add(add);
            e.add(view);
            t.add(change);
            x.add(logout);
            x.add(exit);
            mb.add(e);
            mb.add(t);
            mb.add(x);
            setJMenuBar(mb);
            setVisible(true);
            setDefaultCloseOperation(3);
        }
    }
    static class Controller
    {
        Model m;
        Login l;
        Home h;
        Controller(Model m,Login l)
        {
            this.m=m;
            this.l=l;
            l.btn.addActionListener(e->
            {
                if(m.login(l.user.getText(),
                        new String(l.pass.getPassword())))
                {
                    JOptionPane.showMessageDialog(l,"Login Success");
                    l.dispose();
                    h=new Home();
                    actions();
                }
                else
                    JOptionPane.showMessageDialog(l,"Wrong Login");
            });
        }
        void actions()
        {
            h.add.addActionListener(e->
            {
                JTextField id=new JTextField();
                JTextField name=new JTextField();
                JTextField dept=new JTextField();
                Object a[]={"ID",id,"Name",name,"Department",dept};
                if(JOptionPane.showConfirmDialog(null,a,"Add",0)==0)
                {
                    m.addEmployee(id.getText(),name.getText(),dept.getText());
                }
            });
            h.view.addActionListener(e->
            {
                JOptionPane.showMessageDialog(h,m.viewEmployee());
            });
            h.change.addActionListener(e->
            {
                String old=JOptionPane.showInputDialog("Old Password");
                String n=JOptionPane.showInputDialog("New Password");
                String c=JOptionPane.showInputDialog("Confirm Password");
                if(m.change(old,n,c))
                    JOptionPane.showMessageDialog(h,"Password Changed");
                else
                    JOptionPane.showMessageDialog(h,"Password Error");
            });
            h.exit.addActionListener(e->System.exit(0));
            h.logout.addActionListener(e->
            {
                h.dispose();
                new Controller(m,new Login());
            });
        }
    }
    public static void main(String args[])
    {
        Model m=new Model();
        Login l=new Login();
        new Controller(m,l);
    }
}
