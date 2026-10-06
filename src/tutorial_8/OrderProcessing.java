package tutorial_8;

class OrderProcessing extends Thread
{
    public OrderProcessing()
    {
        setName("OrderProcessing");
        setPriority(8);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread:"+getName());
            System.out.println("Priority:"+getPriority());
            System.out.println("Processing customer order");
            System.out.println();
            try
            {
                sleep(500);
            }
            catch(Exception e)
            {
            }
        }
    }
}
class DeliveryTracking extends Thread
{
    public DeliveryTracking()
    {
        setName("DeliveryTracking");
        setPriority(5);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread:"+getName());
            System.out.println("Priority:"+getPriority());
            System.out.println("Tracking delivery");
            System.out.println();
            try
            {
                sleep(500);
            }
            catch(Exception e)
            {
            }
        }
    }
}
class Notification extends Thread
{
    public Notification()
    {
        setName("Notification");
        setPriority(3);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread:"+getName());
            System.out.println("Priority:"+getPriority());
            System.out.println("Sending notification");
            System.out.println();
            try
            {
                sleep(500);
            }
            catch(Exception e)
            {
            }
        }
    }
}
public class FoodDelivery
{
    public static void main(String args[])
    {
        OrderProcessing t1=new Orderprocessing();
        DeliveryTracking t2=new Deliverytracking();
        Notification t3=new Notification();
        t1.start();
        t2.start();
        t3.start();
    }
}
