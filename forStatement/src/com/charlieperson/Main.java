package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        for(int i=8; i>1; i--) {
            System.out.println(i + "% interest on 10000 = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for(int i=123234; i<1000000000; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if (count > 2) {
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double cash, double interestRate) {
        return cash * (interestRate/100);
    }

    public static boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i<num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
