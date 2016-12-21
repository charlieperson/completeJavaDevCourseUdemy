package com.charlieperson;

public class Main {

    public static void main(String[] args) {
        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100));
        System.out.println("Your final score was " + calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else return 0;
    }

}
