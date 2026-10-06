package tutorial_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserLogin extends JFrame implements ActionListener
{
    JTextField username;
    JPasswordField password;
    JCheckBox remember, notification;
    JButton login;
    UserLogin()
    {
        setTitle("User Login");
        setSize(350,300);
        setLayout(new FlowLayout());
        JLabel u=new JLabel("Username:");
        username=new JTextField(20);
        JLabel p=new JLabel("Password:");
        password=new JPasswordField(20);
        remember=new JCheckBox("Remember Me");
        notification=new JCheckBox("Receive Notifications");
        login=new JButton("Login");
        add(u);
        add(username);
        add(p);
        add(password);
        add(remember);
        add(notification);
        add(login);
        login.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionperformed(Actionevent e)
    {
        String user=username.getText();
        String pass=new String(password.getPassword());
        if(user.equals("admin") && pass.equals("1234"))
        {
            String msg="Login Successful";
            if(remember.isSelected())
            {
                msg=msg+"\nRemember Me Selected";
            }
            if(notification.isselected())
            {
                msg=msg+"\nNotifications Enabled";
            }
            JOptionPane.showMessagedialog(this,msg);
        }
        else
        {
            JOptionPane.showMessagedialog(this,"Invalid Username or Password");
        }
    }
    public static void main(String args[])
    {
        new Userlogin();
    }
}
