package tutorial_3;

class Ride
{
    int rideNo;
    String rideName;
    Ride(int no, String name)
    {
        rideNo = no;
        rideName = name;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Ride r[] = new Ride[5];
        r[0] = new Ride(1, "Roller Coaster");
        r[1] = new Ride(2, "Ferris Wheel");
        r[2] = new Ride(3, "Bumper Cars");
        r[3] = new Ride(4, "Water Ride");
        r[4] = new Ride(5, "Haunted House");
        System.out.println("Activity Level of Rides\n");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(r[i].rideName + " : ");
            for(int j = 1; j <= r[i].rideNo; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
