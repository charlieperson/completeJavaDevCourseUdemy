package com.charlieperson;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myValues = getIntegers(3);
        for(int i=0; i<myValues.length; i++) {
            System.out.println("Value: " + myValues[i] + " was typed in as input");
        }
        System.out.println("Average of the array is..... " + getAverage(myValues));
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
