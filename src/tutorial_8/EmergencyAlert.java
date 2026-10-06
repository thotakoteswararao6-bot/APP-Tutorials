package tutorial_8;

class EmergencyAlert extends thread
{
    public EmergencyAlert()
    {
        setName("EmergencyAlert");
        setPriority(10);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread:"+getName());
            System.out.println("Priority:"+getPriority());
            System.out.println("Checking emergency patients");
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
class VitalMonitor extends Thread
{
    public vitalmonitor()
    {
        setName("vitalmonitor");
        setPriority(5);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread:"+getName());
            System.out.println("Priority:"+getPriority());
            System.out.println("Monitoring vital signs");
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
class ReportGenerator extends Thread
{
    public ReportGenerator()
    {
        setName("ReportGenerator");
        setPriority(1);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread:"+getName());
            System.out.println("Priority:"+getPriority());
            System.out.println("Preparing reports");
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
public class HospitalMonitoring
{
    public static void main(String args[])
    {
        EmergencyAlert t1=new EmergencyAlert();
        VitalMonitor t2=new VitalMonitor();
        ReportGenerator t3=new ReportGenerator();
        t1.start();
        t2.start();
        t3.start();
    }
}
