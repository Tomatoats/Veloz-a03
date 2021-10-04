package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");
    //use Delimiter so that way strings will take in spaces as well

    private static String readStringsFromUser(String prompt) {
        System.out.println(prompt);
        //take in a name
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 35
         *  Copyright 2021 Alexys Veloz
         */
        /*So for this one, we're gonna take strings from the user, and if they aren't blank,
        we're gonna put them in a Arraylist. once they are blank, we're gonna put it in a class
        where we take a random number, that's between the bounds of the Array, and
        use that to determine the winner, printing it out.
         */
        //make the string arraylist and take in strings

        int counter = 0;
        ArrayList<String> totalNames =new ArrayList<String>();
        String name;

        name = readStringsFromUser("Enter a name:");
        //while a name doesn't equal "blank", take in more names
        while (!name .equals(""))
        {
            totalNames.add(name);
            counter++;
            //use the counter so we know how many elements are in the array list
            name = readStringsFromUser("Enter a name:");
        }
        //send to a class to figure out the winner

        FindWinner userWinner = new FindWinner (totalNames, counter);
    }
}
