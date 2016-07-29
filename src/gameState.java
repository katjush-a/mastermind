import java.util.ArrayList;

class GameState{
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
        return !guesses.stream().anyMatch(Guess::isCorrect) && guesses.size() > 10;
    }

    boolean isInProgress(){
        return !isWon() && this.guesses.size() <= 10;
    }
}