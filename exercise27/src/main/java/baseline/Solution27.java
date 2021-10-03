package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
    }

    private static int readAmountFromUser(String prompt) {
        //take in ints from a user
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 27
         *  Copyright 2021 Alexys Veloz
         */
        /*so for this class we're gonna take in the input. in the next class
        we'll look at the inputs and see if they hold up by bringing them to the validateInput function
         aaaaaaaaaand yeah */

        //take in first name, last name, zip code, employeeID
        String firstName = readStringsFromUser("psuedo");
        String lastName = readStringsFromUser("psuedo");
        int ZIPcode = readAmountFromUser("psuedo");
        String employeeID = readStringsFromUser("psuedo");

        //take the variables to a newwclass
        Verifier userinfo = new Verifier(firstName,lastName,ZIPcode,employeeID);
    }
}