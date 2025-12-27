public class LeapYear {
    public static void main (String[] args) {
        boolean isLeap = isLeapYear(1994);
        System.out.println(isLeap);
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9_999) return false;
        if (
            (year % 4) == 0 &&
            (year % 100) != 0
        ) return true;

        if (
            (year % 100) == 0 &&
            (year % 400) == 0
        ) return true;

        return false;
    }
}
