package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEven(90));

        int startingNum = 14;
        int endingNum = 20;
        int count = 0;

        while(startingNum <= endingNum) {
            if(!isEven(startingNum)) {
                startingNum++;
                continue;
            }

            System.out.println("even: " + startingNum);
            count++;
            if(count > 4) break;
            startingNum++;
        }
        System.out.println("Total even numbers found: " + count);
    }

    public static boolean isEven(int num) {
        if(num % 2 == 0) return true;
        return false;
    }
}
