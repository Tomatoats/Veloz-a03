package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static String readFromUser(String prompt) {
        System.out.println(prompt);
        //take in the password from the user
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 25
         *  Copyright 2021 Alexys Veloz
         */
        /* Aight dawg to do this solution we gotta take in a password
        and we send it into a function that looks at the password and
        sees if it meets any of the specifications of the very strong
        password, give that a number I can use to know it means very strong.
        If it doesn't meet the specifications, go down the list. If it doesn't meet
        any of the ones on that list,  say it's a password of unknown strength.
         */

        //initialize password string
        String password;
        //take in the string.
        password = readFromUser("Heyo, this is a password Checker!\nIt checks the strength of your password.\nInput in your password to find out how strong it is!");
        //take tis to another class to do the actual calculations.
        PasswordChecker userpassword = new PasswordChecker(password);
    }
}
