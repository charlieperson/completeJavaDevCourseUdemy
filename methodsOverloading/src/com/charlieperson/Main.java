package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2, 9.43));
        System.out.println(calcFeetAndInchesToCentimeters(33.43));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >=0 && inches <= 12) {
            return (30.48 * feet) + (inches * 2.54);
        } else return -1d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            double remainingInches = inches % 12;
            double feet = (inches - remainingInches) / 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else return -1d;
    }
}
