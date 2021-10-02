package baseline;

import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);

    private static int readGamesFromUser(String prompt) {
        System.out.println(prompt);
        //ask for int.
        //while the user doesn't give us numbers, [1-3]
        //keep em looping until we get a valid int.
        return in.nextInt();
    }

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        //ask for y/n,
        //while the user doesn't give us y or n,
        //keep em looping until we get a valid string
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 32
         *  Copyright 2021 Alexys Veloz
         */
        /*So in this class we'll ask what level they want, 1, 2, 3,
        and put the game in another class. Once this game is done, it'll ask here
        if they wanna play again. if they say yes, the game repeats.
         */
        int gameversion = 0;
        String playagain = "";
        //take in the  number level that they wanted to play
        gameversion = readGamesFromUser("psuedo");

        GuessingGame userGuess = new GuessingGame(gameversion);

        //ask user if they want to play again
        playagain = readStringsFromUser("psuedo");

        //while they want to play again, take in gameversion again, do guessinggame again, then ask again
        while (playagain.equals("y") || playagain.equals("Y")) {
            gameversion = readGamesFromUser("psuedo");
            new GuessingGame(gameversion);
            playagain = readStringsFromUser("psuedo");
        }
    }
}
