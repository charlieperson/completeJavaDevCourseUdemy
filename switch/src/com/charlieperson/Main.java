package com.charlieperson;

public class Main {

    public static void main(String[] args) {
	    int switchVal = 3;

        switch(switchVal) {
            case 9:
                System.out.println("The number is a nine");
                break;

            case 2:
                System.out.println("The number is a two");
                break;

            default:
                System.out.println("The number is something other than a nine or a two");
                break;
        }

        char switchChar = 'B';

        switch(switchChar) {

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("SOMETHIN' ELSE");
                break;
        }
    }
}
