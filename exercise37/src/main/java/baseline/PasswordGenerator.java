package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {

    public PasswordGenerator(int length, int specialCharacters, int numbers) {
        //make a random generator
        Random characterGenerator = new Random();

        //add counters
        int numberCounter = 0;
        int specialCounter = 0;
        int lengthCounter;



        //make lists
        List<Integer> letters = new ArrayList<Integer>();
        List<Integer> Numbers = new ArrayList<Integer>();
        List<Integer> SpecialCharacters = new ArrayList<Integer>();

        //make a random length
        int realLength = characterGenerator.nextInt(4)+ length;

        ArrayList<Character> password = new ArrayList<Character>();
        //make a random number generator
        while (specialCounter == 0 && numberCounter == 0){
            for (lengthCounter = 0; lengthCounter < realLength; lengthCounter++)
            {
                int randomCharacter = characterGenerator.nextInt(94) + 33;
                //if its within the Special Character list and special counter != specialCharacters
                //convert randomCharacter to a char, add it to the password, and up the special counter

                //else if   its within the number list and number counter != Numbers
                //convert randomChararcter to a char, add it to the password, and up the number counter

                //else
                //convert it to a char, add it to password
                //password.add(randomCharacter)


            }
            //if special counter !=specialcharaters || numbercounter != Numbers
            //make special counter 0 and number counter 0, clear password with password.clear()
        }

        //print out the password
        System.out.printf("Your password is %s", password);

    }
}
