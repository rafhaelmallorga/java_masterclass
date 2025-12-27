public class DecimalComparator {
    public static void main(String[] args) {
        boolean isEqual = areEqualByThreeDecimalPlaces(-1.3456, -1.345);
        System.out.println(isEqual);
    }

    public static boolean areEqualByThreeDecimalPlaces (double first, double second) {
        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }
}
