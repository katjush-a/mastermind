import static org.junit.Assert.*;
import org.junit.Test;

public class SequenceTest {

    @Test
    public void AllCorrectReturnsAllBlack(){
        PegSequence guess = new PegSequence(

                Colors.red,Colors.red,Colors.red,Colors.red
        );

        PegSequence answer = new PegSequence(
                Colors.red,Colors.red,Colors.red,Colors.red
        );

        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.black, Colors.black, Colors.black, Colors.black
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void AllWrongReturnsAllBlank(){
        PegSequence guess = new PegSequence(
                Colors.red, Colors.red, Colors.red, Colors.red
        );

        PegSequence answer = new PegSequence(
                Colors.green, Colors.green, Colors.green, Colors.green
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.nil, Colors.nil, Colors.nil, Colors.nil
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void OnePartialReturnsOneWhite(){
        PegSequence guess = new PegSequence(
                Colors.red, Colors.orange, Colors.orange, Colors.orange
        );

        PegSequence answer = new PegSequence(
                Colors.green, Colors.red, Colors.green, Colors.green
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.white, Colors.nil, Colors.nil, Colors.nil
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void OnePerfectOnePartialReturnsBlackAndWhite(){
        PegSequence guess = new PegSequence(
                Colors.red, Colors.orange, Colors.blue, Colors.orange
        );

        PegSequence answer = new PegSequence(
                Colors.red, Colors.blue, Colors.green, Colors.green
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.black, Colors.white, Colors.nil, Colors.nil
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void HalfCorreftReturnsBlackAndBlack(){
        PegSequence guess = new PegSequence(
                Colors.red, Colors.red, Colors.blue, Colors.orange
        );

        PegSequence answer = new PegSequence(
                Colors.red, Colors.red, Colors.green, Colors.green
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.black, Colors.black, Colors.nil, Colors.nil
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void OtherHalfCorrectReturnsBlackAndBlack(){
        PegSequence guess = new PegSequence(
                Colors.blue, Colors.blue, Colors.green, Colors.green
        );

        PegSequence answer = new PegSequence(
                Colors.red, Colors.red, Colors.green, Colors.green
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.black, Colors.black, Colors.nil, Colors.nil
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void HalfEachRetunsTwoBlackTwoWhite(){
        PegSequence guess = new PegSequence(
                Colors.red, Colors.blue, Colors.red, Colors.blue
        );

        PegSequence answer = new PegSequence(
                Colors.red, Colors.red, Colors.blue, Colors.blue
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.black, Colors.black, Colors.white, Colors.white
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void OtherHalfReturnsTwoWhiteTwoBlack(){
        PegSequence guess = new PegSequence(
                Colors.blue, Colors.red, Colors.blue, Colors.red
        );

        PegSequence answer = new PegSequence(
                Colors.red, Colors.red, Colors.blue, Colors.green
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.black, Colors.black, Colors.white, Colors.white
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs());
    }

    @Test
    public void AllPartialReturnsAllWhite(){
        PegSequence guess = new PegSequence(
                Colors.blue, Colors.purple, Colors.red, Colors.green
        );

        PegSequence answer = new PegSequence(
                Colors.red, Colors.green, Colors.purple, Colors.blue
        );


        Sequence sequence = new Sequence(answer, guess);

        PegSequence expected = new PegSequence(
                Colors.white, Colors.white, Colors.white, Colors.white
        );

        PegSequence actual = sequence.getComparison();

        assertEquals(expected.getPegs(), actual.getPegs() );
    }
}