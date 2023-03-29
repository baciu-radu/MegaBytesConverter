public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(58361);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int fullMB = Math.round(kiloBytes/1024)*1024;
        int remainingKB = kiloBytes - fullMB;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes / 1024) + " MB and " + remainingKB + " KB");
    }

}