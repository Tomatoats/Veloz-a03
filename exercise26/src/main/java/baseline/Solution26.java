package baseline;

import java.time.Month;
import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    private static double readFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }

    private double setMonthlyPayment() {
        double x = readFromUser("psuedo");
        return x;
    }

    private double setAPR() {
        double x = readFromUser("psuedo");
        return x;
    }

    private double setBalance() {
        double x = readFromUser("psuedo");
        return x;
    }


    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
         *  Copyright 2021 Alexys Veloz
         */
        /*Alrighty bois so for this one we're finding how long it takes to
        pay off a credit card. An interesting thing to note is that I can't use
        parameters like I usually do, so later i will be using get and set functions.
        Aaanyway psuedocode of what to do: THis class will take in  the balance, apr (as a percentage) and
        their monthly payment. I'm not good with get and set but my initial goal is to do set in
         thhis class and then use get to get them in the other class. If that doesn't work
         THen in PaymentCalculator I will make get and set functions.
         */

        Solution26 app = new Solution26();

        //Get balance
        double balance= app.readFromUser("psuedo");

        //get APR
        double APR = app.readFromUser("psuedo");

        //get monthly payment
        double Monthly_Payment = app.readFromUser("psuedo");
        //all of these set commands will include a readFromUser function in order to get user input

        //then we'll take these and put it into Payment Calculator
        PaymentCalculator userpayment = new PaymentCalculator(balance, APR, Monthly_Payment);


    }


}
