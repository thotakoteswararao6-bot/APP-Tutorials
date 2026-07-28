package tutorial_1;


public class SwapWithTemp {
    public static void main(String[] args) {
        int roll1 = 101;
        int roll2 = 202;
        System.out.println("Before Swap: Roll1 = " + roll1 + ", Roll2 = " + roll2);
        int temp = roll1;
        roll1 = roll2;
        roll2 = temp;
        System.out.println("After Swap (Temp): Roll1 = " + roll1 + ", Roll2 = " + roll2);
    }
}