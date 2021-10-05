import baseline.GuessingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class GuessingTest {

    @Test
    void DoesItWorkWithLowerGuesses(){
        int guess = 5;
        assertEquals("too low, guess again bud!", e1(guess));
    }
    @Test
    void DoesItWorkWithHigherGuesses(){
        int guess = 15;
        assertEquals("too high, guess again bud!", e1(guess));
    }
    @Test
    void DOesItWorkWithEqualGuesses(){
        int guess = 10;
        assertEquals("you got it!", e1(guess));
    }

    private String e1(int guess){
        String result ="";
        int correct = 10;
        if (guess < correct){
            result = "too low, guess again bud!";
        } else if (guess > correct) {
            result = "too high, guess again bud!";
        }
        else {
            result = "you got it!";
        }
        return result;
    }
}
