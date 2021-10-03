package baseline;

public class Eightball {

    public Eightball(int random) {
        // equalize the privates and  publics except no since sonar lint says so

        String result = "";
        //use RandomnNumber as a switch case
        switch (random){
            //have cases 1-4 which would be various 8 ball sentences, with 0 acting as a default
            case 0: result = "Oh uh that  shouldn't be happening";
                break;
            case 1: result = "Yes.";
                break;
            case 2: result = "No.";
                break;
            case 3: result = "Maybe";
                break;
            case 4: result = "Ask again later.";
                break;
        }
        //print out the results.
        System.out.println(result);

    }
}
