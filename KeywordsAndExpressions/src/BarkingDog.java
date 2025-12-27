public class BarkingDog {
    public static void main (String[] args) {
        boolean should = shouldWakeUp(true, 12);
        System.out.print(should);
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) return false;

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
