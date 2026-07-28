package tutorial_1;

public class SeatNumberCheck {
    public static void main(String[] args) {
        int seatNumber = 27;
        if (seatNumber % 2 == 0) {
            System.out.println("Seat Number " + seatNumber + " is EVEN.
                    Go to Even Counter.");
        } else {
            System.out.println("Seat Number " + seatNumber + " is ODD.
                    Go to Odd Counter.");
        }
    }
}