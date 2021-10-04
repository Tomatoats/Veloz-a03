package baseline;

import java.util.ArrayList;
import java.util.Random;

public class FindWinner {
    public FindWinner(ArrayList<String> totalNames, int counter) {

        //make a random number from 0 to counter
        Random random = new Random();
        int winner = random.nextInt(counter)+1;

        //print out the string in element equal to the random number
        System.out.printf("The winner is... %s", totalNames.get(winner));



    }
}
