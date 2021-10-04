
import baseline.AnagramChecker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class AngramCheck {
    AnagramChecker e1;

    @Test
    void DoSpacesCount(){
        String Tester = "s p a c e";
        assertEquals("aceps", e1.stringManipulation(Tester));
    }
    @Test
    void doCapsCount(){
        String Tester = "Abc";
        assertEquals("abc", e1.stringManipulation(Tester));
    }

    @Test
    void doCharatersNotEqual(){
        String Test1 ="abc";
        String Test2 = "abcd";
        assertEquals("This is not an anagram", e1.isAnagram(Test1,Test2));
    }
}
