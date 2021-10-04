import baseline.PasswordChecker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class PasswordTester {
PasswordChecker e1;

@Test
void isUnknownStrengthPossible(){
    String password = "5j";
    assertEquals(5, e1.passwordValidator(password));
}

}
