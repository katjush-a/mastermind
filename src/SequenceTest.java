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
/*
    @Test
    public void AllWrongReturnsAllBlank(){
        Sequence sequence = new Sequence(new char[]{'r','r','r','r'});
        char[] secret = new char[]{'g','g','g','g'};
        assertArrayEquals(new char[]{'0','0','0','0'}, sequence.compare(secret));
    }

    @Test
    public void OneCloseReturnsOneWhite(){
        Sequence sequence = new Sequence(new char[]{'r','o','o','o'});
        char[] secret = new char[]{'g','r','g','g'};
        assertArrayEquals(new char[]{'0','W','0','0'}, sequence.compare(secret));
    }

    @Test
    public void OneCorrectOneCloseReturnsBlackAndWhite(){
        Sequence sequence = new Sequence(new char[]{'r','o','b','o'});
        char[] secret = new char[]{'r','b','g','g'};
        assertArrayEquals(new char[]{'B','W','0','0'}, sequence.compare(secret));
    }

    @Test
    public void HalfCorrectReturnsBlackAndBlack(){
        Sequence sequence = new Sequence(new char[]{'r','r','b','o'});
        char[] secret = new char[]{'r','r','g','g'};
        assertArrayEquals(new char[]{'B','B','0','0'}, sequence.compare(secret));
    }

    @Test
    public void OtherHalfCorrectReturnsBlackAndBlack(){
        Sequence sequence = new Sequence(new char[]{'b','b','g','g'});
        char[] secret = new char[]{'r','r','g','g'};
        assertArrayEquals(new char[]{'0','0','B','B'}, sequence.compare(secret));
    }

    @Test
    public void HalfEachReturnsTwoBlackTwoWhite(){
        Sequence sequence = new Sequence(new char[]{'r','b','r','b'});
        char[] secret = new char[]{'r','r','b','b'};
        assertArrayEquals(new char[]{'B','W','W','B'}, sequence.compare(secret));
    }

    @Test
    public void OtherHalfEachReturnsTwoBlackTwoWhite(){
        Sequence sequence = new Sequence(new char[]{'b','r','b','r'});
        char[] secret = new char[]{'r','r','b','b'};
        assertArrayEquals(new char[]{'W','B','B','W'}, sequence.compare(secret));
    }

    @Test
    public void AllCloseReturnsAllWhite(){
        Sequence sequence = new Sequence(new char[]{'b','p','r','g'});
        char[] secret = new char[]{'r','g','p','b'};
        assertArrayEquals(new char[]{'W','W','W','W'}, sequence.compare(secret));
    }*/
}