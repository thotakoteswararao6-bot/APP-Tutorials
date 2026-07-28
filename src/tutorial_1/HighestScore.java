package tutorial_1;

public class HighestScore {
    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 92;
        int score3 = 78;
        int highest = score1;
        if (score2 > highest) {
            highest = score2;
        }
        if (score3 > highest) {
            highest = score3;
        }
        System.out.println("Scores: " + score1 + ", " + score2 + ", " + score3);
        System.out.println("Highest Score: " + highest);
    }
}