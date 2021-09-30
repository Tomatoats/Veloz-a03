package baseline;

public class PaymentCalculator {
    private double Balance;
    private double theAPr;
    private double payment;
    //privatize the doubles

    private double getBalance(){
    return this.Balance;
    }
    private double getTheAPr(){
        return this.theAPr;
    }
    private double getPayment(){
        return this.payment;
    }
    private double calculateMonthsUntilPaidOff(){
        //initialize variables
        double numbermonths = 0;
        double dailyrate = getTheAPr() / 365;
        double bal = getBalance();
        double payments = getPayment();

        //make the formula
        numbermonths = 0 + 0; //psuedo

        //round the number of months up to a whole number

        return numbermonths;
    }


    public PaymentCalculator(double balance, double APR, double Monthly_Payment){
        //equalize the parameters to private doubles
        Balance = balance;
        theAPr = APR;
        payment = Monthly_Payment;

        //make the CalculateMontsuntilPaidoff, where instead of parameters, it uses the get functions

        //print out the values
        System.out.printf("It will take you %.0f months to pay off this card.", calculateMonthsUntilPaidOff());

        }

    }

