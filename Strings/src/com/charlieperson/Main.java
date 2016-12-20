package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    double myVar = 20d;
        double secondVar = 81d;
        if (((myVar + secondVar) * 25) % 40 <= 20)
            System.out.println("Over the limit: " + ((myVar + secondVar) * 25) % 40);

    }
}
