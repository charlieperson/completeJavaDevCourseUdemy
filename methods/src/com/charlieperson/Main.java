package com.charlieperson;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100));
//        System.out.println("Your final score was " + calculateScore(true, 10000, 8, 200));
        int jimPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jimmy", jimPosition);

        int susiePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Susie", susiePosition);

        int harryPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Harry", harryPosition);

        int frankPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Frank", frankPosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else return 0;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
