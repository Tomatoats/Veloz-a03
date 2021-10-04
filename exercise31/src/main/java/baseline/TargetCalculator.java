package baseline;

public class TargetCalculator {

    public TargetCalculator(int restingHeartRate, int age) {
        //equalize private to public parameters
        //privitize ints

        //make intensity and TargetHeartRate variables

        //print out Intensity   | Rate
        System.out.println("Intensity     | Rate");
        System.out.println("--------------|-------");
        board(restingHeartRate, age);
    }
        public static void board(int restingHeartRate, int age){
            //make the for loop and formula
            double intensity;
            double targetHeartRate;
            for ( intensity = 55; intensity < 100; intensity += 5) {
            //input formula
            targetHeartRate = ((((220 - age) - restingHeartRate)*(intensity/100)) +restingHeartRate);
            //print out intensity and the perspective rates
            System.out.printf("%.0f%%           | %.0f bpm%n", intensity, targetHeartRate);
        }
    }
}
