package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(40, 30, 50);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("15 inch retina", "Mac", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("AF-350", "Asus", 4, 6, "2.44");
        PC thePC = new PC(theCase, monitor, theMotherboard);
        thePC.powerUp();
    }
}
