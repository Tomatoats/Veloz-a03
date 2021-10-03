package baseline;

import java.util.Scanner;

public class Solution30 {

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 3 Solution 30
         *  Copyright 2021 Alexys Veloz
         */
        /* so it'll be hard to do this in two different classes it's easy to do this in one but I'll try
        imma make a length and width I hard code it in to make this table, place it in another class,
        and make a nested for loop, where it goes up to length times width, and then it'll print out the product
        of the length times width.
         */

        //make length and width of this mult table
        int length = 12;
        int width = 12;
        //to change this up we could make this scanned in from user to make it a certain width each times but you don't ask

        //send length and width to another class
        MultiplicationTable userMultiplication = new MultiplicationTable(length, width);
    }
}
