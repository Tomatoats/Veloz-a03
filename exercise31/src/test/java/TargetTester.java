import baseline.TargetCalculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class TargetTester {
    TargetCalculator e1;

    @Test
    void DoesBoardWork(){
        int RestingHR = 65;
        int Age = 22;
        assertEquals(138.15, e1(RestingHR,Age), 0.001);
    }

    private double e1(int restingHR, int age) {
        //make the for loop and formula
        double intensity=55;
        double targetHeartRate;
            //input formula
            targetHeartRate = ((((220 - age) - restingHR)*(intensity/100)) +restingHR);
            //print out intensity and the perspective rates
            return targetHeartRate;
        }
    }

