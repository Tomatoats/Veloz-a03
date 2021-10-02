package baseline;

import java.util.Scanner;

public class Solution29 {

    private static Double readFromUser(String prompt) {
        System.out.println(prompt);
        //ask for the double.
        //while it's not a digit [0-9], and it isn't 0,
        // it will return that double
        //else, it'll print out its a non valid input
        return in.nextDouble();
    }

    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 29
         *  Copyright 2021 Alexys Veloz
         */
        /*With Solution 29 We need to take in the rate of the return given to us by the user
        plug it into the formula, and return how many years it'll take for it to invest.
        The constraint is only allowing digits, no 0, and a loop till they get it right
         */

        //create double Rate
        double Rate = readFromUser("psuedo");

        //make another class to calculate the years to double your return.
        ReturnCalculator userReturn = new ReturnCalculator(Rate);

    }
}
