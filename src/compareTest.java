import static org.junit.Assert.*;
import org.junit.Test;

public class compareTest {

    @Test
    public void allCorrectReturnsAllBlack(){
        Sequence sequence = new Sequence(new char[]{'r','r','r','r'});
        char[] secret = new char[]{'r','r','r','r'};
        assertArrayEquals(new char[]{'B','B','B','B'}, sequence.compare(secret));
    }

    @Test
    public void allWrongReturnsAllBlank(){
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
        System.out.println(sequence.compare(secret));
        assertArrayEquals(new char[]{'B','W','0','0'}, sequence.compare(secret));
    }
}