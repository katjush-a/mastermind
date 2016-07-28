import java.util.ArrayList;

class GameState{
    private ArrayList<Guess> guesses = new ArrayList<>();
    private PegSequence answer;
    private int lastElement = guesses.size() < 1 ? 0 : guesses.size() - 1;

    GameState() {
        this.answer = new Answer().generateRandom();
    }
    GameState(PegSequence testAnswer){
        this.answer = testAnswer;
    }

    ArrayList<Guess> getGuesses(){
        return guesses;
    }

    void addGuess(Guess guess){
        guesses.add(guess);
        Sequence seq = new Sequence(this.answer, guess.getSequence());
        guess.setResponse(seq.getComparison());
    }

    boolean isInProgress() {
        return (guesses.get(lastElement).isCorrect() || guesses.size() <= 10);
    }

    boolean isWin(){
        return guesses.get(lastElement).isCorrect();
    }

    boolean isLoss(){
        return (!isInProgress() && !guesses.get(lastElement).isCorrect());
    }
}