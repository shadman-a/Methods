package dev.shadmanahmed;

public class Main {

    public static void main(String[] args) {
        int playerScore = 1500;
        String name = "John";
        calculateHighScorePosition(playerScore, name);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table" );
    }

    public static void calculateHighScorePosition(int playerScore, String name) {
        int position;
        if (playerScore > 1000) {
            position = 1;
        } else if (playerScore > 500 && playerScore < 1000){
            position = 2;
        } else if (playerScore > 1100 && playerScore < 500){
            position = 3;
        } else {
            position = 4;
        }

        displayHighScorePosition(name, position);
    }
}
