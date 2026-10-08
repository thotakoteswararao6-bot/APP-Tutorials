package tutorial_9;

create database library;
        use library;
        create table Book(
        BookID int primary key,
        Title varchar(50),
        Author varchar(50),
        Price int,
        Availability varchar(20)
        );
import java.sql.*;
import java.util.*;
public class Main
{
    static Connection con;
    public static void connect()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","password");
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void insert()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Book ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            String title=sc.nextLine();
            System.out.print("Author: ");
            String author=sc.nextLine();
            System.out.print("Price: ");
            int price=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("insert into Book values(?,?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,title);
            ps.setString(3,author);
            ps.setInt(4,price);
            ps.setString(5,"Available");
            ps.executeUpdate();
            System.out.println("Book Added");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void search()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Book ID: ");
            int id=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("select * from Book where BookID=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void display()
    {
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select*from Book where Availability='Available'");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getInt(4)+" "+rs.getString(5));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void update()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Book ID: ");
            int id=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("update Book set Availability=? where BookID=?");
            ps.setString(1,"Issued");
            ps.setInt(2,id);
            ps.executeUpdate();
            System.out.println("Book Status Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        connect();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1.Insert Book");
            System.out.println("2.Search Book");
            System.out.println("3.Display Available Books");
            System.out.println("4.Issue Book");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    insert();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
