import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest{

    private PegSequence sequence;
    private Guess guess;

    @Before
    public void setGuessInstance() {
        this.sequence = new PegSequence(Colors.red, Colors.red, Colors.red, Colors.red);
        this.guess = new Guess(this.sequence);
    }

    @Test
    public void guessHasSequence(){
        assertEquals(this.guess.getSequence(), this.sequence);
    }

    @Test
    public void guessHasResponse(){
        PegSequence response = new PegSequence(Colors.black,Colors.black,Colors.black,Colors.black);
        this.guess.setResponse(response);

        assertEquals(response, this.guess.getResponse());
    }

    @Test
    public void checkGuessIsIncorrect() {
        PegSequence response = new PegSequence(Colors.nil,Colors.nil,Colors.nil,Colors.nil);
        this.guess.setResponse(response);

        assertFalse(this.guess.isCorrect());
    }

    @Test
    public void checkGuessIsCorrect(){
        PegSequence response = new PegSequence(Colors.black,Colors.black,Colors.black,Colors.black);

        this.guess.setResponse(response);

        assertTrue(this.guess.isCorrect());
    }
}