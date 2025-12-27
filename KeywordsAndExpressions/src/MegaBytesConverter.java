public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int kiloBytesDiff = kiloBytes % 1024;
        // int megaBytes = (int) Math.floor(kiloBytes / 1024);
        int megaBytes = Math.toIntExact((int) Math.floor(kiloBytes / 1024));

        System.out.println(
                kiloBytes +
                        " KB = " +
                        megaBytes +
                        " MB and " +
                        kiloBytesDiff +
                        " KB"
        );
    }
}
