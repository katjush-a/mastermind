import org.junit.Test;

import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void noGuessesAtStart() {
        GameState gameState = new GameState();

        assertEquals(0, gameState.getGuesses().size());
    }

    @Test
    public void addGuessToGuesses() {
        GameState gameState = new GameState();
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));

        gameState.addGuess(guess);

        assertEquals(1, gameState.getGuesses().size());
    }

    @Test
    public void firstGuessCorrectWins(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red));
        GameState gameState = new GameState(answer);

        gameState.addGuess(guess);

        assertTrue(gameState.isWon());
    }

    @Test
    public void noCorrectGuessDoesNotWin(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        GameState gameState = new GameState(answer);

        gameState.addGuess(guess);

        assertFalse(gameState.isWon());
    }

    @Test
    public void thirdGuessCorrectWins(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        Guess anotherGuess = new Guess(new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red));
        GameState gameState = new GameState(answer);

        gameState.addGuess(guess);
        gameState.addGuess(guess);
        gameState.addGuess(anotherGuess);

        assertTrue(gameState.isWon());
    }

    @Test
    public void noCorrectMoreThanTenLoses(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        GameState gameState = new GameState(answer);

        for(int i = 0;i < 10;i++){
            gameState.addGuess(guess);
        }

        assertTrue(gameState.isLost());
    }

    @Test
    public void gameIsWonLostIsFalse(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red));
        GameState gameState = new GameState(answer);

        gameState.addGuess(guess);

        assertTrue(gameState.isWon());
        assertFalse(gameState.isLost());
    }

    @Test
    public void noCorrectAtTenGuessesLoses(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        GameState gameState = new GameState(answer);

        for(int i = 0;i <= 10;i++){
            gameState.addGuess(guess);
        }

        assertTrue(gameState.isLost());
    }

    @Test
    public void gameIsWonSoIsNotInProgress(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red));
        GameState gameState = new GameState(answer);

        gameState.addGuess(guess);

        assertFalse(gameState.isInProgress());
    }

    @Test
    public void gameIsGoingSoIsInProgress(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        GameState gameState = new GameState(answer);

        gameState.addGuess(guess);

        assertTrue(gameState.isInProgress());
    }

    @Test
    public void gameHasTenGuessesSoIsNotInProgress(){
        PegSequence answer = new PegSequence(Colors.red,Colors.red,Colors.red,Colors.red);
        Guess guess = new Guess(new PegSequence(Colors.blue,Colors.blue,Colors.blue,Colors.blue));
        GameState gameState = new GameState(answer);

        for(int i = 0;i <= 10; i++){
            gameState.addGuess(guess);
        }

        assertFalse(gameState.isInProgress());
    }
}