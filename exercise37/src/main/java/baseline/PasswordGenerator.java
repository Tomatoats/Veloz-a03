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
        char character;



        //make lists
        List<Integer> letters = new ArrayList<Integer>();
        for(int i = 65; i < 91; i++){
            letters.add(i);
        }
        for(int i =97; i < 122; i++){
            letters.add(i);
        }
        List<Integer> NumbersList = new ArrayList<Integer>();
        for(int i = 48; i < 58; i++){
            NumbersList.add(i);
        }
        List<Integer> SpecialCharactersList = new ArrayList<Integer>();
        for(int i = 33; i < 48; i++){
            SpecialCharactersList.add(i);
        }
        for(int i = 58; i < 65; i++){
            SpecialCharactersList.add(i);
        }
        for(int i = 91; i < 97; i++){
            SpecialCharactersList.add(i);
        }
        for(int i = 123; i < 127; i++){
            SpecialCharactersList.add(i);
        }
        //make a random length
        int realLength = characterGenerator.nextInt(4)+ length;

        ArrayList<Character> password = new ArrayList<Character>();
        //make a random number generator
        while (specialCounter == 0 && numberCounter == 0) {
            for (lengthCounter = 0; lengthCounter < realLength; lengthCounter++) {
                int randomCharacter = characterGenerator.nextInt(94) + 33;
                //if its within the Special Character list and special counter != specialCharacters
                if (SpecialCharactersList.contains(randomCharacter) && specialCounter != specialCharacters) {
                    //convert randomCharacter to a char, add it to the password, and up the special counter
                    character = (char) (randomCharacter);
                    password.add(character);
                    specialCounter++;
                }
                //else if   its within the number list and number counter != Numbers
                else if (NumbersList.contains(randomCharacter) && numberCounter != numbers) {
                    //convert randomChararcter to a char, add it to the password, and up the number counter
                    character = (char) (randomCharacter);
                    password.add(character);
                    numberCounter++;
                }
                //else
                else if (letters.contains(randomCharacter))
                {
                    //convert it to a char, add it to password
                    character = (char) (randomCharacter);
                    password.add(character);
                }
                else
                {
                    lengthCounter--;
                }


            }

            //if special counter !=specialcharaters || numbercounter != Numbers
            if (specialCounter != specialCharacters || numberCounter != numbers) {
                //make special counter 0 and number counter 0, clear password with password.clear()
                specialCounter = 0;
                numberCounter = 0;
                password.clear();
            }
        }
        //print out the password
        System.out.printf("Your password is ");
        Object[] finalPass= password.toArray(new Character[0]);
        for (Object obj : finalPass)
        {
            System.out.print(obj);
        }

    }
}
