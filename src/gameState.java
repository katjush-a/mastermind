import java.util.ArrayList;

class GameState{
    private ArrayList<Guess> guesses = new ArrayList<>();
    private PegSequence answer;

    GameState() {
        this.answer = new Answer().generateRandom();
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
        return (guesses.get(guesses.size() - 1).isCorrect() || guesses.size() <= 10);
    }

}