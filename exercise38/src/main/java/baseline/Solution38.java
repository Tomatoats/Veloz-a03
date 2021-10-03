package baseline;

import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");

    private static String readAmountFromUser(String prompt) {
        //take in ints from a user
        System.out.println(prompt);
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 38
         *  Copyright 2021 Alexys Veloz
         */
        /*So in this class we're gonna take in a list of values, put them into an int array, and
        take that array into another class. in that class, we're going to put that array into a function
        that function will take a look at each element. if it divides by 2 evenly, we'll add it into the new array,
        and print that out.
         */

        //prompt the user to give us a list of numbers
        String numberString = readAmountFromUser("psuedo");

        String[] numberArray =  numberString.split("\\s*, \\s*");
        //send this string to another class to figure out which ones are even

        ArrayManipulator userArray = new ArrayManipulator(numberArray);
    }
}