import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class eightballTest {

    @Test
    void DoesCase0Work() {
        int random = 0;
        assertEquals("Oh uh that  shouldn't be happening", Eightball(random));
    }
    @Test
    void DoesCase1Work() {
        int random = 1;
        assertEquals("Yes.", Eightball(random));
    }
    @Test
    void DoesCase2Work() {
        int random = 2;
        assertEquals("No.", Eightball(random));
    }
    @Test
    void DoesCase3Work() {
        int random = 3;
        assertEquals("Maybe", Eightball(random));
    }
    @Test
    void DoesCase4Work() {
        int random = 4;
        assertEquals("Ask again later.", Eightball(random));
    }


    private String Eightball(int random) {
        String result = "";
        switch (random) {
            //have cases 1-4 which would be various 8 ball sentences, with 0 acting as a default
            case 0:
                result = "Oh uh that  shouldn't be happening";
                break;
            case 1:
                result = "Yes.";
                break;
            case 2:
                result = "No.";
                break;
            case 3:
                result = "Maybe";
                break;
            case 4:
                result = "Ask again later.";
                break;
        }
        //print out the results.}
        return result;
    }
}