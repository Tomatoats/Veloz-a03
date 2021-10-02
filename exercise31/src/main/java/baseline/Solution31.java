package baseline;

import java.util.Scanner;

public class Solution31  {

    private static final Scanner in = new Scanner(System.in);

    private static int readFromUser(String prompt) {
        System.out.println(prompt);
        //ask for int and return an int.
        //while the user doesn't give us numbers,
        //keep em looping until we get a valid int.
        return in.nextInt();
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 31
         *  Copyright 2021 Alexys Veloz
         */
        /*So for this one I'm going to take in the resting heart bate and Age,
        and make sure that we only take in ints. Once that happens, I take it into another class
        where we do some calculations, and print out the proper way that the example wants to see.
         */

        //take in resting heart rate and Age.
        int RestingHeartRate = readFromUser("psuedo");
        int Age = readFromUser("psuedo");

        TargetCalculator userTarget = new TargetCalculator(RestingHeartRate,Age);
    }
}
