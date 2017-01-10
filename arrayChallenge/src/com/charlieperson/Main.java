package com.charlieperson;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] chucky = getIntegers(3);
        printArray(sortArray(chucky));
    }

    public static int[] sortArray(int[] inputArray) {
        int[] sortedArray = new int[inputArray.length];
        int biggest = 0;
        int biggestIndex = 0;

        for(int j=0; j<inputArray.length; j++) {
            for(int i=0; i<inputArray.length; i++) {
                if(inputArray[i] > biggest) {
                    biggest = inputArray[i];
                    biggestIndex = i;
                }
            }
            sortedArray[j] = biggest;
            inputArray[biggestIndex] = 0;
            biggest = 0;
        }

        return sortedArray;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers");
        int[] values = new int[number];

        for(int i=0; i<number; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
