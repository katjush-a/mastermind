import java.util.ArrayList;
import java.util.List;

class GameState{

    boolean inProgress = true;
    List<Guess> guesses = new ArrayList<>();
    PegSequence answer;

    GameState() {
        this.answer = new Answer().generateRandom();
    }

    void addGuess(Guess guess){
        guesses.add(guess);
        Sequence seq = new Sequence(this.answer, guess.getSequence());
        guess.setResponse(seq.getComparison());
        this.inProgress = (guess.isCorrect() || guesses.size() <= 10);

    }
}