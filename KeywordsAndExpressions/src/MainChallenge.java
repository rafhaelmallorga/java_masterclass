import java.util.*;

public class MainChallenge {
    public static void main(String[] args) {
        calculateScore(true, 10_000, 8, 200);
        calculateScore(true, 20_000, 16, 400);
        int myAge = calculateMyAge(1994);

        System.out.println("My current age is: " + myAge);

        if (myAge < 21) {
            System.out.println("You're too young. Get away from here!");
        } else {
            System.out.println("Welcome sir...");
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateMyAge (int birthdayAge) {
        Date currentDate = new Date();
        return (currentDate.getYear() + 1900) - birthdayAge;
    }
}