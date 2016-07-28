import org.junit.Test;

import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void noGuessesAtStart(){
        GameState gameState = new GameState();

        assertEquals(0, gameState.getGuesses().size());
    }

    @Test
    public void addGuess(){
        GameState gameState = new GameState();
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));

        gameState.addGuess(guess);

        assertEquals(1, gameState.getGuesses().size());
    }

    @Test
    public void assertGameIsGoing(){
        GameState gameState = new GameState();
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        gameState.addGuess(guess);

        assertTrue(gameState.isInProgress());
    }

    @Test
    public void assertGameIsOver(){
        GameState gameState = new GameState();
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        for (int i = 0; i <= 10; i++) {
            gameState.addGuess(guess);
        }
        
        assertFalse(gameState.isInProgress());
    }

    @Test
    public void assertGameIsWon(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,
                                             Colors.red,Colors.red);
        GameState gameState = new GameState(answer);
        Guess guess = new Guess(new PegSequence(Colors.red,Colors.red,
                                                Colors.red,Colors.red));
        gameState.addGuess(guess);
        assertTrue(gameState.isWin());
    }

    @Test
    public void assertGameIsLost(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,
                Colors.red,Colors.red);
        GameState gameState = new GameState(answer);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,
                Colors.blue,Colors.blue));
        for(int i = 0;i <= 10; i++){
            gameState.addGuess(guess);
        }
        assertTrue(gameState.isLoss());
    }
}