package baseline;

import java.util.Scanner;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        //since we don't actually need the question to funcion, there is no checks
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 33
         *  Copyright 2021 Alexys Veloz
         */
        /* So in this class we don't really need the string but we'll take it anyway, '
        then make a random number here, put it into a another class where it is a switch statement,
        where the random number coallates to a string that will be outputted in that class.
         */

        //take in the string from the user.
        String Userquestion = readStringsFromUser("psuedo");

        //make an int that is then equal to a random number generator from 1-4
        int random = 0;

        //take that int to another class
        Eightball useranswer = new Eightball(random);
    }
}
