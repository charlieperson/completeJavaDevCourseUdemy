package com.charlieperson;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = getIntegers(5);
	    printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter " + capacity + " digits please\n");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortIntegers(int[] inputArray) {
        int[] sorted = Arrays.copyOf(inputArray, inputArray.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sorted.length-1; i++) {
                if(sorted[i] < sorted[i+1]) {
                    temp = sorted[i+1];
                    sorted[i+1] = sorted[i];
                    sorted[i] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }


}
