package baseline;

public class Output {
    //privatize the variables
    public Output(double total){
        //equalize the privatized variables to the new one

        //print out the statement
        if (total % 1 ==0)
        {
            System.out.printf("The total is %.0f", total);
        }
        else
        {
            System.out.printf("The total is %f", total);
        }
    }
}
