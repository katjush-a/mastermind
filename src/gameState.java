import java.util.ArrayList;

class GameState{
    private int MAX_GUESSES = 10;
    private ArrayList<Guess> guesses = new ArrayList<>();
    private PegSequence answer;

    GameState() {
        this.answer = new Answer().generateRandom();
    }
    GameState(PegSequence testAnswer) {
        this.answer = testAnswer;
    }

    ArrayList<Guess> getGuesses() {
        return guesses;
    }

    void addGuess(Guess guess){
        guesses.add(guess);
        Sequence seq = new Sequence(this.answer, guess.getSequence());
        guess.setResponse(seq.getComparison());
    }

    boolean isWon() {
        return guesses.stream().anyMatch(Guess::isCorrect);
    }

    boolean isLost(){
        return !isWon() && guesses.size() >= MAX_GUESSES;
    }

    boolean isInProgress(){
        return !isWon() && !isLost() && this.guesses.size() <= MAX_GUESSES;
    }
}