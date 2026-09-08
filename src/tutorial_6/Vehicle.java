package tutorial_6;

class Vehicle {
    String vehicleNumber;
    String brand;
    int speed;
    Vehicle(String vehicleNumber, String brand, int speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }
    void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Speed          : " + speed + " km/h");
    }
}
class Car extends Vehicle {
    int numberOfDoors;
    Car(String vehicleNumber, String brand, int speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    void displayDetails() {
        System.out.println("----- Car Details -----");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Speed          : " + speed + " km/h");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Bike extends Vehicle {
    boolean hasGear;
    Bike(String vehicleNumber, String brand, int speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }
    @Override
    void displayDetails() {
        System.out.println("----- Bike Details -----");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Speed          : " + speed + " km/h");
        System.out.println("Has Gear       : " + hasGear);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car("AP39AB1234", "Hyundai", 180, 4);
        v.displayDetails();
        System.out.println();
        v = new Bike("AP39CD5678", "Yamaha", 120, true);
        v.displayDetails();
    }
}

