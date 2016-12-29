package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Printer duplexPrinter = new Printer(true);
        Printer standardPrinter = new Printer(false);
        duplexPrinter.fillToner(99);
        duplexPrinter.fillToner(20);
        duplexPrinter.print(110);
//        standardPrinter.fillToner(100);
//        standardPrinter.print(40);
    }
}
