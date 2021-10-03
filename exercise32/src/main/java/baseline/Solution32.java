package baseline;

import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);

    private static int readGamesFromUser(String prompt) {
        System.out.println(prompt);
        //ask for int.

        //while the user doesn't give us numbers
        while(!in.hasNextInt())
        {
            System.out.println("Please, only give us the number 1, 2, or 3");
            in.next();
        }
        //keep em looping until we get a valid int.
        return in.nextInt();
    }

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        //ask for y/n
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
        String error = "Please, only give us the number 1, 2, or 3";
        System.out.printf("Let's play Guess the number!%nDifficulty 1 has numbers 1-10.%nDifficulty 2 has numbers 1-100.%nDifficulty 3 has numbers 1-1000.%n");
        //take in the  number level that they wanted to play
        gameversion = readGamesFromUser("Enter the difficulty you'd like to play! (1, 2, or 3)");
        while (gameversion < 1 || gameversion > 3)
        {
            gameversion = readGamesFromUser(error);
        }

        GuessingGame userGuess = new GuessingGame(gameversion);

        //ask user if they want to play again
        playagain = readStringsFromUser("Do you wish to play again? (Y/N)?");
        while (!playagain.equals("Y") && !playagain.equals("y") && !playagain.equals("N") && !playagain.equals(("n")))
        {
            playagain = readStringsFromUser("Please only give me 'y' or 'n'");
            //while the user doesn't give us y or n,
            //keep em looping until we get a valid string
        }

        //while they want to play again, take in gameversion again, do guessinggame again, then ask again
        while (playagain.equals("y") || playagain.equals("Y")) {
            gameversion = readGamesFromUser("Enter the difficulty you'd like to play! (1, 2, or 3)");
            while (gameversion < 1 || gameversion > 3)
            {
                gameversion = readGamesFromUser(error);
            }
            new GuessingGame(gameversion);
            playagain = readStringsFromUser("Do you wish to play again? (Y/N)?");
            while (!playagain.equals("Y") && !playagain.equals("y") && !playagain.equals("N") && !playagain.equals(("n")))
            {
                playagain = readStringsFromUser("Please only give me 'y' or 'n'");
                //while the user doesn't give us y or n,
                //keep em looping until we get a valid string
            }
        }
    }
}
