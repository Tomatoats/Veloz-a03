import baseline.ArrayManipulator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManipulatorTest {
    ArrayManipulator e1;

    @Test
    void DoesFilterEvenNumbersWork(){

        int totalSize = 5;
        int numberIntArray[] = new int[totalSize];
        numberIntArray[0] = 1;
        numberIntArray[1] = 2;
        numberIntArray[2] = 3;
        numberIntArray[3] = 4;
        numberIntArray[4] = 5;

        int newSize = 2;
        int evenArray[] = new int [newSize];
        evenArray[0] = 2;
        evenArray[1] = 4;
        assertEquals(evenArray, e1.filterEvenNumbers(numberIntArray,totalSize));
        // so it's giving me expected: [I@3637f3fa<[2, 4]> but was: [I@4ac94d54<[2, 4]>
        //but i'll take it since it's giving me [2, 4] for the actual array list.
    }
    @Test
    void DoesParsingWork(){
        int totalSize = 5;
        String Array[] = new String[totalSize];
        Array[0] = "1";
        Array[1] = "2";
        Array[2] = "3";
        Array[3] = "4";
        Array[4] = "5";
        int newSize = 5;
        int intArray[] = new int [newSize];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        assertEquals(intArray, e1.parseArray(Array,totalSize));
        //expected: [I@4ac94d54<[1, 2, 3, 4, 5]> but was: [I@7117a0a8<[1, 2, 3, 4, 5]>
        //they're the same I think???? I just wish I knew how to properly do this
    }
}
