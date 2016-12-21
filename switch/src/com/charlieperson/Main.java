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

        char switchChar = 'D';

        switch(switchChar) {
            case 'A':
                System.out.println("BIG A");
                break;

            case 'B':
                System.out.println("BIG B");
                break;


            case 'C':
                System.out.println("BIG C");
                break;

            case 'D':
                System.out.println("BIG D");
                break;

            case 'E':
                System.out.println("BIG E");
                break;

            default:
                System.out.println("SOMETHIN' ELSE");
                break;
        }
    }
}
