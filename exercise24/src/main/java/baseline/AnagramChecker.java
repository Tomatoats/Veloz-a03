package baseline;

public class AnagramChecker {
    private String phrase1;
    private String phrase2;
    private String IsAnagram(String phrase1, String phrase2) {
        String result = "";
        //anagrams don't care about capitalization so I'll sanitize them here
        //so that it doesn't care about capitalization
        //then I'd take out all the spaces from a string, leaving just the characters
        //if the character limit isn't the same, it isn't an anagram

        //else
        //sort the strings so the characters show up in alphbetical / Ascii order
        //check the strings one character at a time, if it doesn't equal the same ascii number/
        //same character, it isn't the same.
        //else, it is the same, and you can make result = "hey they're anagrams of each other"
        //and if not make result = "hey they're not anagrams of each other"
        return result;
    }


    public AnagramChecker(String first_phrase, String second_phrase) {
        //so here we're gonna set them for private strings so that
        //the main strings don't get messed up
        first_phrase = phrase1;
        second_phrase = phrase2;

        //send the two phrases into isAnagram();
        System.out.println(IsAnagram(phrase1, phrase2));
        //print out whether it's an anagram or not.
    }
}
