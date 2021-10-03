package baseline;

import java.lang.reflect.Array;

public class ArrayManipulator {
    //not gonna privatize anymore since sonarlint hates it for some reason
    private int[] parseArray(String[] numberArray, int numberArraySize) {
        //take in array and parse it element by element
        //return the new int array
        int[] intArray = {0};
        return intArray;
    }

    private int[] filterEvenNumbers(int[] numberIntArray, int numberArraySize) {
        //in a for loop from 0 to the size of the array,
        // if the element can equal 0 mod 2, its an even array, add it to the new even array
        //else, go to the next element
        //return the new even array
        int[] evenArray = {0};
        return evenArray;
    }




    public ArrayManipulator(String[] numberArray){
        //get the length
        int numberArraySize = numberArray.length;
        //make a function to turn numberArray to int array
        int[] numberIntArray = parseArray(numberArray, numberArraySize);

        //make a function to filterEvenNUmbers
        int[] evenIntArray = filterEvenNumbers(numberIntArray, numberArraySize);

        //print out the even int array
    }


}
