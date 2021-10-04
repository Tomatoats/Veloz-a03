package baseline;

import java.util.ArrayList;

import java.util.Collections;

public class StatisticsCalculator {
    public static double average(ArrayList<Double> totalNumbers, int counter) {
        //add up all the totalNumbers in a loop, divide by counter + 1 since we start at 0;
        double sum =0;
        for (int i = 0; i < counter; i++){
            sum += totalNumbers.get(i);
        }

        double average = sum / (counter);
        return average;
    }
    public static double min(ArrayList<Double> totalNumbers, int counter) {
        //sort the arrayList by lowest to highest, choose at element 0
        Collections.sort(totalNumbers);
        double min = totalNumbers.get(0);
        return min;
    }
    public static double max(ArrayList<Double> totalNumbers, int counter) {
        //sort the arraylist by lowest to highest, choose at counter which would be highest element
        Collections.sort(totalNumbers);
        double max = totalNumbers.get(counter-1);
        return max;
    }
    public static double std(ArrayList<Double> totalNumbers, int counter) {
        //take average, then use a for loop to minus all numbers in the list by the average, square it,
        //then divide that by total elements (counter) and take the square root of that
        double average = average(totalNumbers, counter);
        double sumOfSquared = 0;
        for (int i = 0; i < counter; i++)
        {
             sumOfSquared += Math.pow((totalNumbers.get(i) - average), 2);
        }
        double std = Math.sqrt(sumOfSquared/counter);
        return std;
    }

    public StatisticsCalculator(ArrayList<Double> totalNumbers) {

        //get the size of the array
        int counter = totalNumbers.size();

        //print out average, minimum, maximum, standardDeviation
        double average = average(totalNumbers, counter);
        double min = min(totalNumbers, counter);
        double max  = max(totalNumbers, counter);
        double std =std(totalNumbers, counter);
        System.out.printf("The average is is %.2f%n", average);
        System.out.printf("The minimum is %.2f%n",min);
        System.out.printf("The Maximum is %.2f%n", max);
        System.out.printf("The standard deviation is %.2f%n", std);
    }
}
