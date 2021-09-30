package baseline;

import java.util.Scanner;

public class Solution28 {
        private static final Scanner in = new Scanner(System.in);

        private static Double readFromUser(String prompt) {
            System.out.println(prompt);
            //ask for int and return an int.
            return in.nextDouble();
        }

        public static void main(String[] args) {
            /*
             *  UCF COP3330 Fall 2021 Assignment 3 Solution 28
             *  Copyright 2021 Alexys Veloz
             */
        /*SO solution 27 scared me so I'm skipping it and now doing 28. The hardest part about this one seems to just be
        splitting it up into two different classes. We're gonna make a for loop
         where total (which will start at 0) will be total + readFromUser
        */

            //make total
            double total = 0;
            //make the for loop
            for (int i = 0; i < 5; i++) {
                //take in the total via prompting the user and counting it up
                total = total + readFromUser("psuedo");
            }
            //send this to a class in order to output total to user
            Output userOutput = new Output(total);

        }
    }
