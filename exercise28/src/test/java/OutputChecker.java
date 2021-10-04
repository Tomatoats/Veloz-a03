
import baseline.Output;
import baseline.Solution28;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class OutputChecker {
    Solution28 e1;

    @Test
    void canIusePlusEqualsinJava(){
        int total = 0;
        for (int i = 0; i < 10; i++){
            total += i;
        }
        assertEquals(45, total);

    }
}
