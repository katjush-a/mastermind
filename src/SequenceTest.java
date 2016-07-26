import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class SequenceTest {

    @Test
    public void AllCorrectReturnsAllBlack(){
        List<String> guess = new PegSequence(
                Colors.red,Colors.red,Colors.red,Colors.red
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red,Colors.red,Colors.red,Colors.red
        ).getPegs();

        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.black, Colors.black, Colors.black, Colors.black
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void AllWrongReturnsAllBlank(){
        List<String> guess = new PegSequence(
                Colors.red, Colors.red, Colors.red, Colors.red
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.green, Colors.green, Colors.green, Colors.green
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.nil, Colors.nil, Colors.nil, Colors.nil
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OnePartialReturnsOneWhite(){
        List<String> guess = new PegSequence(
                Colors.red, Colors.orange, Colors.orange, Colors.orange
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.green, Colors.red, Colors.green, Colors.green
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.white, Colors.nil, Colors.nil, Colors.nil
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OnePerfectOnePartialReturnsBlackAndWhite(){
        List<String> guess = new PegSequence(
                Colors.red, Colors.orange, Colors.blue, Colors.orange
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red, Colors.blue, Colors.green, Colors.green
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.black, Colors.white, Colors.nil, Colors.nil
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void HalfCorreftReturnsBlackAndBlack(){
        List<String> guess = new PegSequence(
                Colors.red, Colors.red, Colors.blue, Colors.orange
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red, Colors.red, Colors.green, Colors.green
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.black, Colors.black, Colors.nil, Colors.nil
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OtherHalfCorrectReturnsBlackAndBlack(){
        List<String> guess = new PegSequence(
                Colors.blue, Colors.blue, Colors.green, Colors.green
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red, Colors.red, Colors.green, Colors.green
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.black, Colors.black, Colors.nil, Colors.nil
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void HalfEachRetunsTwoBlackTwoWhite(){
        List<String> guess = new PegSequence(
                Colors.red, Colors.blue, Colors.red, Colors.blue
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red, Colors.red, Colors.blue, Colors.blue
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.black, Colors.black, Colors.white, Colors.white
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OtherHalfReturnsTwoWhiteTwoBlack(){
        List<String> guess = new PegSequence(
                Colors.blue, Colors.red, Colors.blue, Colors.red
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red, Colors.red, Colors.blue, Colors.green
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.black, Colors.black, Colors.white, Colors.white
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void AllPartialReturnsAllWhite(){
        List<String> guess = new PegSequence(
                Colors.blue, Colors.purple, Colors.red, Colors.green
        ).getPegs();

        List<String> answer = new PegSequence(
                Colors.red, Colors.green, Colors.purple, Colors.blue
        ).getPegs();


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new PegSequence(
                Colors.white, Colors.white, Colors.white, Colors.white
        ).getPegs();

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }
}