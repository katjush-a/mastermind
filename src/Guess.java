public class Guess {

    PegSequence sequence;

    Guess(PegSequence sequence) {
        this.sequence = sequence;
    }

    PegSequence setResponse(PegSequence answer){
        Sequence sequence = new Sequence(answer, this.sequence);
        return sequence.getComparison();
    }
}