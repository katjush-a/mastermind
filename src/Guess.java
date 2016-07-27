public class Guess {

    private PegSequence sequence;
    private PegSequence response;

    Guess(PegSequence sequence) {
        this.sequence = sequence;
    }

    public PegSequence getSequence() {
        return this.sequence;
    }

    public void setResponse(PegSequence response){
        this.response = response;
    }

    public PegSequence getResponse() {
        return this.response;
    }

    public boolean isCorrect() {
        return this.response.getPegs().stream().allMatch(
                peg -> peg == Colors.black
        );
    }
}