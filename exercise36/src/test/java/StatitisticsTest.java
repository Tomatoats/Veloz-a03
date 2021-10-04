import baseline.StatisticsCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class StatitisticsTest {
   StatisticsCalculator e1;
   StatisticsCalculator e2;

    /*@BeforeEach
   void initStats(){
        ArrayList<Double> total1 = new ArrayList<Double>();
        total1.add(200.0);
        total1.add(400.0);
        total1.add(600.0);

        ArrayList<Double> total2 = new ArrayList<Double>();
        total2.add(100.0);
        total2.add(200.0);
        total2.add(1000.0);
        total2.add(300.0);
        e1 = new StatisticsCalculator(total1);
        e2 = new StatisticsCalculator(total2);
   }*/

    @Test
    void averageTest() {
        ArrayList<Double> total1 = new ArrayList<Double>();
        total1.add(200.0);
        total1.add(400.0);
        total1.add(600.0);
        int counter  = 3;

    assertEquals(400, e1.average(total1, counter), 0.001);
    }
    void minTest(){
        ArrayList<Double> total1 = new ArrayList<Double>();
        total1.add(200.0);
        total1.add(400.0);
        total1.add(600.0);
        int counter = 3;
        assertEquals(200, e1.min(total1, counter), 0.001);
    }

    void maxTest() {
        ArrayList<Double> total1 = new ArrayList<Double>();
        total1.add(200.0);
        total1.add(400.0);
        total1.add(600.0);
        int counter = 3;
        assertEquals(600, e1.max(total1, counter), 0.001);
    }
    void stdTest(){
        ArrayList<Double> total2 = new ArrayList<Double>();
        total2.add(100.0);
        total2.add(200.0);
        total2.add(1000.0);
        total2.add(300.0);
        int counter = 4;
        assertEquals(353.55, e2.max(total2, counter), 0.001);
    }

}

