package baseline;

import java.util.Scanner;

public class GuessingGame {
    //privatize gameversion
    private int GameVersion;

    private static final Scanner in = new Scanner(System.in);
    private static int readNumbersFromUser(String prompt) {
        System.out.println(prompt);
        //ask for int.
        //while the user doesn't give us numbers, [0-9]
        //keep em looping until we get a valid int.
        return in.nextInt();
    }

    public GuessingGame(int gameversion) {
        //equalize the private to public
        GameVersion = gameversion;
        //make int variables for guess and total guesses
        int guess = 0;
        int totalGuesses = 0;


        //make 3 different versions;
        if (GameVersion == 1){
            //take a random digit from 1-10

            //take in a guess
            guess = readNumbersFromUser("psuedo");

            //while guess is not equal random number
                //if it is too low: totalGuesses++; print "too Low, guess again", and scan in a guess
                //else, totalGuesses++; print "too high, guess again", and scan it in another guess

            //print out: You got in %d guesses! where %d is totalGuesses
        }
        else if (GameVersion == 2){
            //take a random digit from 1-100

            //take in a guess
            guess = readNumbersFromUser("psuedo");

            //while guess is not equal random number
            //if it is too low: totalGuesses++; print "too Low, guess again", and scan in a guess
            //else, totalGuesses++; print "too high, guess again", and scan it in another guess

            //print out: You got in %d guesses! where %d is totalGuesses

        }
        else if (GameVersion == 3){
            //take a random digit from 1-1000

            //take in a guess
            guess = readNumbersFromUser("psuedo");

            //while guess is not equal random number
            //if it is too low: totalGuesses++; print "too Low, guess again", and scan in a guess
            //else, totalGuesses++; print "too high, guess again", and scan it in another guess

            //print out: You got in %d guesses! where %d is totalGuesses
        }
        else {
            System.out.println("Oh no this shouldn't happen");
        }
        //now this goes to the main and it asks etc again
    }
}
