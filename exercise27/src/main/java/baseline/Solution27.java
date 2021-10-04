package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
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
        String firstName = readStringsFromUser("Enter the first name:");
        String lastName = readStringsFromUser("Enter the last name:");
        String ZIPstring = readStringsFromUser("Enter the ZIP code:");
        //make sure ZIPcode is an int
        int character;
        int counter = 0;
        int ZIPcode = 1000;
        for (int i = 0; i < ZIPstring.length(); i++)
        {

            character = (int) (ZIPstring.charAt(i));
            if (character > 64 && character < 91)
            {
                counter++;
            }
        }
        if (counter == ZIPstring.length())
        {
            ZIPcode = Integer.parseInt(ZIPstring);
        }

        String employeeID = readStringsFromUser("Enter the employee ID:");

        //take the variables to a newwclass
        Verifier userinfo = new Verifier(firstName,lastName,ZIPcode,employeeID);
    }
}