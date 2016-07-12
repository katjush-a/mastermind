import static org.junit.Assert.*;
import org.junit.Test;

public class compareTest {

    @Test
    public static void allTrueReturnsAllBlack(){
        Sequence sequence = new Sequence(char[]{'r','r','r','r'});
        Secret secret = new Secret(char[]{'r','r','r','r'});
        assertArrayEquals(char[]{'b','b','b','b'}, sequence.compare(secret)});
    }
}