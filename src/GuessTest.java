import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GuessTest{

    @Test
    public void guessHasResponse(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red));

        PegSequence expected = new PegSequence(Colors.black,Colors.black,Colors.black,Colors.black);

        assertEquals(guess.setResponse(answer), expected);
    }
}