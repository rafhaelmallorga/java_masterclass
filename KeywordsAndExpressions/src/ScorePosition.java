public class ScorePosition {
    public static void main(String[] args) {

        int score = calculateHighScorePosition(1000);
        displayHighScorePosition("Mallorga", score);

        score = calculateHighScorePosition(500);
        displayHighScorePosition("Mallorga", score);

        score = calculateHighScorePosition(100);
        displayHighScorePosition("Mallorga", score);

        score = calculateHighScorePosition(1);
        displayHighScorePosition("Mallorga", score);
    }

    public static int calculateHighScorePosition (int score) {
        if (score >= 1_000) return 1;
        else if (score >= 500) return 2;
        else if (score >= 100) return 3;
        else return 4;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }
}