import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceTest {

    @Test
    public void AllCorrectReturnsAllBlack(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.red,Colors.red,Colors.red,Colors.red)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red,Colors.red,Colors.red,Colors.red)
        );

        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.black, Colors.black, Colors.black, Colors.black)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void AllWrongReturnsAllBlank(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.red, Colors.red, Colors.red)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.green, Colors.green, Colors.green, Colors.green)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.nil, Colors.nil, Colors.nil, Colors.nil)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OnePartialReturnsOneWhite(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.orange, Colors.orange, Colors.orange)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.green, Colors.red, Colors.green, Colors.green)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.white, Colors.nil, Colors.nil, Colors.nil)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OnePerfectOnePartialReturnsBlackAndWhite(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.orange, Colors.blue, Colors.orange)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.blue, Colors.green, Colors.green)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.black, Colors.white, Colors.nil, Colors.nil)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void HalfCorreftReturnsBlackAndBlack(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.red, Colors.blue, Colors.orange)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.red, Colors.green, Colors.green)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.black, Colors.black, Colors.nil, Colors.nil)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OtherHalfCorrectReturnsBlackAndBlack(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.blue, Colors.blue, Colors.green, Colors.green)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.red, Colors.green, Colors.green)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.black, Colors.black, Colors.nil, Colors.nil)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void HalfEachRetunsTwoBlackTwoWhite(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.blue, Colors.red, Colors.blue)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.red, Colors.blue, Colors.blue)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.black, Colors.black, Colors.white, Colors.white)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void OtherHalfReturnsTwoWhiteTwoBlack(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.blue, Colors.red, Colors.blue, Colors.red)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.red, Colors.blue, Colors.green)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.black, Colors.black, Colors.white, Colors.white)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }

    @Test
    public void AllPartialReturnsAllWhite(){
        List<String> guess = new ArrayList<>(
                Arrays.asList(Colors.blue, Colors.purple, Colors.red, Colors.green)
        );

        List<String> answer = new ArrayList<>(
                Arrays.asList(Colors.red, Colors.green, Colors.purple, Colors.blue)
        );


        Sequence sequence = new Sequence(answer, guess);

        List<String> expected = new ArrayList<>(
                Arrays.asList(Colors.white, Colors.white, Colors.white, Colors.white)
        );

        List<String> actual = sequence.getComparison();

        assertEquals(expected, actual);
    }
}