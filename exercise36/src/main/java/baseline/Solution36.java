package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    private static final Scanner in = new Scanner(System.in);

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        //take in a number that for now we're gonna treat as a string
        return in.next();
    }
    private static double parseInputFromUser(String inputFromUser){
        //parse the input to a double
        return Double.parseDouble((inputFromUser));
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 36
         *  Copyright 2021 Alexys Veloz
         */
        /*OKay so we're gonna be a tricky with it. We're not gonna take in any
        numbers at all, but instead strings. if the string isn't equal to "done"
        we take that string and parse it as a double, adding it to an arraylist.
         Once that is done, we're going to send it to another class where it will do the
         average, max, min, and std functions.
         */

        //set up the ArrayList
        ArrayList<Double> totalNumbers = new ArrayList<Double>();
        //take in numbers from the user
        String inputFromUser = readStringsFromUser("psuedo");

        //while it isn't equal to done, continue the loop and parse
        while (!inputFromUser .equals("done"))
        {
            //parse the input and add it to the array list,
        }

        //send it to another class to get the average, mins, max, and std
        StatisticsCalculator userstats = new StatisticsCalculator(totalNumbers);
    }
}