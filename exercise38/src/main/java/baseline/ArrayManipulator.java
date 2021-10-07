package baseline;

import java.lang.reflect.Array;

public class ArrayManipulator {
    //not gonna privatize anymore since sonarlint hates it for some reason
    public static int[] parseArray(String[] numberArray, int numberArraySize) {
        //take in array and parse it element by element
        int tempnumber;

        int[] intArray = new int[numberArraySize];
        for (int i = 0; i < numberArraySize; i++)
        {
            tempnumber  = Integer.parseInt(numberArray[i]);
            intArray[i] = tempnumber;
        }
        //return the new int array
        return intArray;
    }

    public static int[] filterEvenNumbers(int[] numberIntArray, int numberArraySize) {
        //in a for loop from 0 to the size of the array,
        int counter = 0;
        //get the size of the even array
        for (int i = 0; i < numberArraySize; i++){
            if (numberIntArray[i] % 2 == 0)
            {
                counter++;
            }
        }
        int[] evenArray = new int [counter];
        counter = 0;
        for (int i = 0; i < numberArraySize; i++){
            // if the element can equal 0 mod 2, its an even array, add it to the new even array
            if (numberIntArray[i] % 2 == 0)
            {
                evenArray[counter] = numberIntArray[i];
                counter++;
            }
            //else, go to the next element
            }
            //return the new even array
        return evenArray;
    }




    public ArrayManipulator(String[] numberArray){
        //get the length
        int numberArraySize = numberArray.length;
        //make a function to turn numberArray to int array
        int[] numberIntArray = parseArray(numberArray, numberArraySize);


        int numberIntlength = numberIntArray.length;
        //make a function to filterEvenNUmbers
        int[] evenIntArray = filterEvenNumbers(numberIntArray, numberIntlength);

        //print out the even int array
        System.out.printf("The even numbers are: ");
        int counter = evenIntArray.length;
        for (int i = 0; i < counter; i++)
        {
            System.out.printf("%d ", evenIntArray[i]);
        }
    }


}
