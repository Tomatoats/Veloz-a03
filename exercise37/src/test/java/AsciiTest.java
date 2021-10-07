import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AsciiTest {
    @Test
    void HeyDoesIntToCharWork(){
        int ASCIIA = 65;
        char shouldBeA = (char) (ASCIIA);
        char A = 65;
        assertEquals(A, shouldBeA(ASCIIA));
    }

    private char shouldBeA(int asciia) {
        char shouldBeA = (char)(asciia);
        return shouldBeA;
    }
}
