import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PegSequence {
    private List<String> pegs;

    PegSequence(String... pegs) {
        this.pegs = new ArrayList<>(Arrays.asList(pegs));
    }

    PegSequence(PegSequence first, PegSequence second) {
        this.pegs = new ArrayList<>();
        pegs.addAll(first.getPegs());
        pegs.addAll(second.getPegs());
    }

    List<String> getPegs() {
        return this.pegs;
    }
}
