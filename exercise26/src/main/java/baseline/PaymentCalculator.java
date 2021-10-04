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
        double numbermonths;
        double dailyrate = getTheAPr() / 365;
        double bal = getBalance();
        double payments = getPayment();


        //make the formula
        double exponentPart = (1-(Math.pow((1+dailyrate),30)));
        System.out.printf("%f\n", exponentPart);
        double logPartIncludingExponent = Math.log10(Math.abs((1+ bal/payments) * exponentPart));
        System.out.printf("%f\n", logPartIncludingExponent);
        System.out.printf("%f\n", logPartIncludingExponent  /30);
        System.out.printf("%f\n", (Math.log10((1+dailyrate))));
        numbermonths =  ( logPartIncludingExponent /-30 / Math.abs((Math.log10((1+dailyrate)))));
        if (numbermonths %1 != 0 && numbermonths %1 < .5)
        {
            numbermonths++;
        }

        return numbermonths;
    }


    public PaymentCalculator(double balance, double APR, double Monthly_Payment){
        //equalize the parameters to private doubles
        Balance = balance;
        theAPr = APR/100;
        payment = Monthly_Payment;

        //make the CalculateMontsuntilPaidoff, where instead of parameters, it uses the get functions

        //print out the values
        double numbermonths = calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %.0f months to pay off this card.", numbermonths);

        }

    }

