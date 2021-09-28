package baseline;

import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String readFromUser(String prompt) {
        //take in the string from the user
        return in.next();

    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 24
         *  Copyright 2021 Alexys Veloz
         */
        /* So for this one, we're taking in two user inputs,
         using those to check if they're an anagram. Anagrams
         is like when you can reorganize a word or phrase to make
         another one. Can only use each letter once. **can** add as many
         spaces as you'd like.
         */

        //Print out  a prompt
        //initialize the strings
        String first_phrase;
        String second_phrase;
        //Take in the two strings from the user
        first_phrase = readFromUser("What's the first string?");
        second_phrase = readFromUser("What's the second string?");

        //take this to another class to do the actual calculations and logic
        AnagramChecker useranagrams = new AnagramChecker(first_phrase,second_phrase);

    }
}
