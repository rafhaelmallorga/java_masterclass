public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
    }
    public static void checkNumber (int number) {
        String value = "positive";

        if (number == 0) value = "zero";
        else if (number < 0) value = "negative";

        System.out.println(value);
    }
}