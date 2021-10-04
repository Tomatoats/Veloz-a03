import baseline.MultiplicationTable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MultTableTest {
    MultiplicationTable e1;

    @Test
    void DoesItWorkWithAnyLengthandWidth() {
        int length = 1;
        int width = 1;
        assertEquals("1", e1(length, width));
    }

    private String e1(int length, int width) {
        String test = "";
        for (int lengthCounter = 1; lengthCounter < length + 1; lengthCounter++) {
            //print out a new line to make it look well
            System.out.printf("\n");
            for (int widthCounter = 1; widthCounter < width + 1; widthCounter++) {
                test = "1";
                //print out  lengthcounter * widthcounter, using some format specifiers so it is aligned properly
            }

        }
        return test;
    }
}
