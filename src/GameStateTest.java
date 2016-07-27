import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void noGuessesAtStart(){
        GameState gameState = new GameState();

        assertEquals(0, gameState.guesses.size());
    }
}