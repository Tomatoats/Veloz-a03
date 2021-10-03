package baseline;

import java.net.PasswordAuthentication;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);

    private static int readAmountFromUser(String prompt) {
        //take in ints from a user
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 37
         *  Copyright 2021 Alexys Veloz
         */
        /*We're going to take in ints in this class, saving the numbers up
        and also at the end counting total characters. then we'll put all that in a class,
        making lists for characters and numbers (if they don't fit that definition, they're a special character
        then we'll make a random generator give us random characters, making sure we need that character.
        if we need it, we'll add it to our char array. if not, we'll ask for another random character
         */
        //prompt user for length, special characters, and numbers
        int length = readAmountFromUser("psuedo");
        int specialCharacters = readAmountFromUser("psuedo");
        int numbers = readAmountFromUser("psuedo");

        //send this to another class
        PasswordGenerator userPassword = new PasswordGenerator(length, specialCharacters, numbers);

    }
}
