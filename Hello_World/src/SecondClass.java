public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("Hello, SecondClass");

        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("That`s not a alien.");
            System.out.println("Thanks God!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greather than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the conditions are true");
        }

        double value_1 = 20.00;
        double value_2 = 80.00;
        double value_3 = (value_1 + value_2) * 100;
        double value_4 = value_3 % 40;

        boolean isZero = value_4 == 0;

        System.out.println("isZero: " + isZero);

        if (isZero) System.out.println("got some remainder");
    }
}
