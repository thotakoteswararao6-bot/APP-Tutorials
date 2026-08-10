package tutorial_2;

class Temperature {
    double celsius;
    void convert() {
        double fahrenheit = (9.0 / 5 * celsius) + 32;
        System.out.println("Celsius Temperature    : " + celsius + "°C");
        System.out.println("Fahrenheit Temperature: " + fahrenheit + "°F");
    }
}
public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature(); // Object creation
        t.celsius = 25;
        t.convert();
    }
}

