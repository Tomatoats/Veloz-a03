package baseline;

import java.util.ArrayList;

public class StatisticsCalculator {
    private static double average(ArrayList<Double> totalNumbers, int counter) {
        //add up all the totalNumbers in a loop, divide by counter + 1 since we start at 0;
        double average = 0;
        return average;
    }
    private static double min(ArrayList<Double> totalNumbers, int counter) {
        //sort the arrayList by lowest to highest, choose at element 0
        double min = 0;
        return min;
    }
    private static double max(ArrayList<Double> totalNumbers, int counter) {
        //sort the arraylist by lowest to highest, choose at counter which would be highest element
        double max = 0;
        return max;
    }
    private static double std(ArrayList<Double> totalNumbers, int counter) {
        //take average, then use a for loop to minus all numbers in the list by the average, square it,
        //then divide that by total elements (counter + 1) and take the square root of that
        double average = average(totalNumbers, counter);
        double std = 0;
        return std;
    }

    public StatisticsCalculator(ArrayList<Double> totalNumbers) {

        //get the size of the array
        int counter = totalNumbers.size();

        //print out numbers via a for loop

        //print out average, minimum, maximum, standardDeviation

        System.out.printf("The average is is %f%nThe minimum is %f%nThe Maximum is %f%nThe standard deviation is %f%n",
                average(totalNumbers, counter), min(totalNumbers, counter), max(totalNumbers, counter), std(totalNumbers, counter));

    }

}
