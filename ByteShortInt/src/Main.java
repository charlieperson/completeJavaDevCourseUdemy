public class Main {

    public static void main(String[] args) {
        byte myBite = 127;
        short myShort = 12345;
        int myInt = 1234567891;
        long myLong = 50000L + (10L * (myBite + myShort + myInt));
        short myShortTotal = (short) (12000 + (myBite + myShort + myInt));
        System.out.println(myLong);
        System.out.println(myShortTotal);
    }
}
