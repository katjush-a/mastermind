import static org.junit.Assert.*;
import org.junit.Test;

public class compareTest {

    @Test
    public void allTrueReturnsAllBlack(){
        Sequence sequence = new Sequence(new char[]{'r','r','r','r'});
        Secret secret = new Secret(new char[]{'r','r','r','r'});
        assertArrayEquals(new char[]{'b','b','b','b'}, sequence.compare(secret));
    }
}