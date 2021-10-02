package baseline;

public class TargetCalculator {
    //privitize ints
    private int RestingHR;
    private int Age;

    public TargetCalculator(int restingHeartRate, int age) {
        //equalize private to public parameters
        RestingHR = restingHeartRate;
        Age = age;

        //make intensity and TargetHeartRate variables
        double intensity;
        double TargetHeartRate = 0;
        //print out Intensity   | Rate
        System.out.println("Intensity     | Rate");
        System.out.println("--------------|-------");

        //make the for loop and formula
        for (intensity = 55; intensity < 100; intensity += 5) {
            //input formula
            TargetHeartRate = 0;
            //print out intensity and the perspective rates
        }
    }
}
