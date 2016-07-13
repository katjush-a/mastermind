import static org.junit.Assert.*;
import org.junit.Test;

public class compareTest {

    @Test
    public void AllCorrectReturnsAllBlack(){
        Sequence sequence = new Sequence(new char[]{'r','r','r','r'});
        char[] secret = new char[]{'r','r','r','r'};
        assertArrayEquals(new char[]{'B','B','B','B'}, sequence.compare(secret));
    }

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
    }
}