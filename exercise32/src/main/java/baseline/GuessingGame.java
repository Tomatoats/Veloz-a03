package baseline;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final Scanner in = new Scanner(System.in);

    private static int readNumbersFromUser(String prompt, int totalGuesses) {
        System.out.println(prompt);
        //ask for int.
        //while the user doesn't give us numbers, [0-9]
        while (!in.hasNextInt())
        {
            //keep em looping until we get a valid int, and add 1 to total guesses
            System.out.println("I need whole numbers only. Guess again!");
            totalGuesses++;
            in.next();
        }
        return in.nextInt();
    }

    public GuessingGame(int gameversion) {
        //equalize the private to public except not since sonarLint hates it
        //make int variables for guess and total guesses
        int guess = 0;
        int totalGuesses = 0;
        Random rand = new Random();
        int random;
        String beginGame = "I have my number. What's your guess?";
        String toLow = "too low, guess again bud!";
        String toHigh = "too high, guess again bud!";


        //make 3 different versions
        if (gameversion == 1) {
            //take a random digit from 1-10
            random = rand.nextInt(10) + 1;
            //take in a guess
            guess = readNumbersFromUser(beginGame, totalGuesses);

            //while guess is not equal random number
            while (guess != random) {
                //if it is too low: totalGuesses++; print "too Low, guess again", and scan in a guess
                if (guess < random) {
                    totalGuesses++;
                    guess = readNumbersFromUser(toLow, totalGuesses);
                }
                //else, totalGuesses++; print "too high, guess again", and scan it in another guess
                else
                {
                    totalGuesses++;
                    guess = readNumbersFromUser(toHigh, totalGuesses);
                }
            }
            //print out: You got in %d guesses! where %d is totalGuesses
            totalGuesses++;
            System.out.printf("you got my number in %d guesses!", totalGuesses);
        }
        else if (gameversion == 2){
            //take a random digit from 1-100
             random = rand.nextInt(100) + 1;

            //take in a guess
            guess = readNumbersFromUser(beginGame, totalGuesses);

            //while guess is not equal random number
            while (guess != random) {
                //if it is too low: totalGuesses++; print "too Low, guess again", and scan in a guess
                if (guess < random) {
                    totalGuesses++;
                    guess = readNumbersFromUser(toLow, totalGuesses);
                }
                //else, totalGuesses++; print "too high, guess again", and scan it in another guess
                else
                {
                    totalGuesses++;
                    guess = readNumbersFromUser(toHigh, totalGuesses);
                }
            }
            //print out: You got in %d guesses! where %d is totalGuesses
            totalGuesses++;
            System.out.printf("you got my number in %d guesses!", totalGuesses);

        }
        else if (gameversion == 3){
            //take a random digit from 1-1000
            random = rand.nextInt(1000)+1;
            //take in a guess
            guess = readNumbersFromUser(beginGame, totalGuesses);

            //while guess is not equal random number
            while (guess != random) {
                //if it is too low: totalGuesses++; print "too Low, guess again", and scan in a guess
                if (guess < random) {
                    totalGuesses++;
                    guess = readNumbersFromUser(toLow, totalGuesses);
                }
                //else, totalGuesses++; print "too high, guess again", and scan it in another guess
                else
                {
                    totalGuesses++;
                    guess = readNumbersFromUser(toHigh, totalGuesses);
                }
            }
            //print out: You got in %d guesses! where %d is totalGuesses
            totalGuesses++;
            System.out.printf("you got my number in %d guesses!", totalGuesses);
        }
        else {
            System.out.println("Oh no this shouldn't happen");
        }
        //now this goes to the main and it asks etc again
    }
}
