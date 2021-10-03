package baseline;

import java.util.Arrays;

public class AnagramChecker {

    private String stringManipulation(String phrase){
        //anagrams don't care about capitalization so I'll sanitize them here
        phrase = phrase.toLowerCase();
        //so that it doesn't care about capitalization
        //then I'd take out all the spaces from a string, leaving just the characters
        phrase = phrase.replaceAll("\\s", "");

        //convert to an array so I can manipulate it
        char[] arrayPhrase = phrase.toCharArray();

        //sort the array.
        Arrays.sort(arrayPhrase);

        //return sorted phrase
        return new String(arrayPhrase);
    }
    private String isAnagram(String phrase1, String phrase2) {
        String result = "";

        //we're gonna mess around with the strings and sort it in another  function
        String sortedPhrase1 = stringManipulation(phrase1);
        String sortedPhrase2 = stringManipulation(phrase2);
        //if the character limit isn't the same, it isn't an anagram
        int characterlimit1 = sortedPhrase1.length();
        int characterlimit2 = sortedPhrase2.length();

        //check the strings one character at a time, if it doesn't equal the same ascii number/
        //same character, it isn't the same.
        if (characterlimit1 != characterlimit2)
        {
            result ="This is not an anagram";
        }
        //else
        else
        {
            //else, it is the same, and you can make result = "hey they're anagrams of each other"
            //and if not make result = "hey they're not anagrams of each other"
            if (sortedPhrase1 .equals(sortedPhrase2))
            {
                result = "This is an anagram";
            }
            else
            {
                result = "This is not an angram";
            }
        }
        return result;
    }


    public AnagramChecker(String firstPhrase, String secondPhrase) {
        //so here we're gonna set them for private strings so that
        //the main strings don't get messed up

        //send the two phrases into isAnagram

        System.out.println(isAnagram(firstPhrase, secondPhrase));
        //print out whether it's an anagram or not.
    }
}
