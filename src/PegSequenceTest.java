import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PegSequenceTest {

    @Test
    public void canGetPegs() {
        PegSequence pegSequence = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.blue);

        assertEquals(new ArrayList<>(Arrays.asList(Colors.red,Colors.red,Colors.red,Colors.blue)),pegSequence.getPegs());
    }

    @Test
    public void createEmptyPegSequence() {
        PegSequence pegSequence = new PegSequence();

        assertEquals(new ArrayList<String>(),pegSequence.getPegs());
    }

    @Test
    public void canTakeTwoPegSequences() {
        PegSequence pegSequence = new PegSequence(Colors.red,Colors.red);
        PegSequence pegSequence1 = new PegSequence(Colors.red, Colors.blue);

        PegSequence combinedSequence = new PegSequence(pegSequence, pegSequence1);

        assertEquals(new ArrayList<>(Arrays.asList(Colors.red, Colors.red, Colors.red, Colors.blue)), combinedSequence.getPegs());
    }
}