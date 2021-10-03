package baseline;

public class ReturnCalculator {

    public ReturnCalculator(double rate) {
        //privatize the double except not because sonarlint hates that

        //make double years
    double years;

    //plug in the formula
        years = 72/ rate;

    //print out the output "it takes %f years to double your initial investment"
    System.out.printf("It takes %f years to double your initial investment", years);
    }
}
