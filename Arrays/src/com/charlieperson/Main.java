package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[4] = 60;
        System.out.println(myIntArray[4]);
        String[] myStringyCollection = {"Leonard", "Kim", "Alex", "Bridget", "Charlie", "Daniel", "Ellie", "Elenore"};
        System.out.println(myStringyCollection[4]);

        int[] forInt = new int[30];

        for(int i=0; i<forInt.length; i++) {
            forInt[i] = i * 1000;
        }

        for(int i=0; i<forInt.length; i++) {
            System.out.println(i + " = " + forInt[i]);
        }
    }
}
