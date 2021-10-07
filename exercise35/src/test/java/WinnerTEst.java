import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class WinnerTEst {
    private String ArrayListtest(int array){
        ArrayList<String> totalNames =new ArrayList<String>();
        String name = "Cuhrazy";
        totalNames.add(name);
        return totalNames.get(array);
    }
    @Test
    void tester(){
        int array = 0;
        assertEquals("Cuhrazy",ArrayListtest(array));
    }
}
//arrayList shenanigans

