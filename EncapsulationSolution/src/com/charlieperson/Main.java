package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    Printer myPrinter = new Printer(90, false);
        myPrinter.addToner(30);
//        myPrinter.printPages(4);
        int pagesPrinted = myPrinter.printPages(4);
        System.out.println("Just printed " + pagesPrinted +
                " pages. Total pages printed is now " +
                myPrinter.getPagesPrinted() + ".");
        pagesPrinted = myPrinter.printPages(2);
        System.out.println("Just printed " + pagesPrinted +
                " pages. Total pages printed is now " +
                myPrinter.getPagesPrinted() + ".");
    }
}
