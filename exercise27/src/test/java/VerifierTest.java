
import baseline.Verifier;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class VerifierTest {
    Verifier e1;

    @Test
    void CanIgetAllErrors(){
        String firstName = "";
        String lastName = "";
        int ZIPcode = 203;
        String id = "A12-3456";
        assertEquals("The first name must be filled in.\nThe first name must be at least 2 characters long.\nThe last name must be filled in.\nThe last name must be at least 2 characters long.\nThe employee ID must be in the format of AA-1234.\nThe zipcode must be a 5 digit number.", e1.validateInput(firstName,lastName,ZIPcode,id));
    }
}
