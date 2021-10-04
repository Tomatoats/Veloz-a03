package baseline;

import java.util.Scanner;

public class Solution34 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");
    //use Delimiter so that way strings will take in spaces as well

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        //take in a name
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 34
         *  Copyright 2021 Alexys Veloz
         */
        /* So for this one we're gonna make a list or Array of employee names,
        printing them out to the user. Then they can choose which name to take out.
        we make sure that string exists in our list, if it doesn't, we'll ask for a valid employee
        Then in another class we'll take out that employee in our list, and print the rest of the names.
         */

        //Make an array of strings
        String[] employeeNames = new String[5];
        employeeNames[0] = "John Smith";
        employeeNames[1] = "Jackie Jackson";
        employeeNames[2] = "Chris Jones";
        employeeNames[3] = "Amanda Cullen";
        employeeNames[4] = "Jeremy Goodwin";

        //tell users the employees via a print
        //System.out.printf("There are 5 employees:%n%s%n%s%n%s%n%s%n%s%n", employeeNames[0],employeeNames[1],employeeNames[2],employeeNames[3],employeeNames[4],employeeNames[5]);
        //take in from user

        String toRemove = readStringsFromUser("Enter an employee name to remove:");
        //make a while loop in which if toRemove doesn't equal any of the  names,
        //make em scan in something else again


        //send it to another class to print the employees excluding toRemove
        restOfEmployees userRemoved = new restOfEmployees(employeeNames, toRemove);

    }
}
