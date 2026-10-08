package tutorial_9;

create database store;
        use store;
        create table Product(
        ProductID int primary key,
        ProductName varchar(50),
        Price int,
        Quantity int
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
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","password");
            System.out.println("Database Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void insertProduct()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Product ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name=sc.nextLine();
            System.out.print("Price: ");
            int price=sc.nextInt();
            System.out.print("Quantity: ");
            int qty=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("insert into Product values(?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,price);
            ps.setInt(4,qty);
            ps.executeUpdate();
            System.out.println("Product Inserted");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void searchProduct()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Product ID: ");
            int id=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("select * from Product where ProductID=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void updateQuantity()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Product ID: ");
            int id=sc.nextInt();
            System.out.print("Enter New Quantity: ");
            int qty=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("update Product set Quantity=? where ProductID=?");
            ps.setInt(1,qty);
            ps.setInt(2,id);
            ps.executeUpdate();
            System.out.println("Quantity Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void displayLowStock()
    {
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Product where Quantity<10");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            }
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
            System.out.println("\n1.Insert Product");
            System.out.println("2.Search Product");
            System.out.println("3.Update Quantity");
            System.out.println("4.Display Low Stock Products");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    insertProduct();
                    break;
                case 2:
                    searchProduct();
                    break;
                case 3:
                    updateQuantity();
                    break;
                case 4:
                    displayLowStock();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

