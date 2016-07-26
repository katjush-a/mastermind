import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PegSequence {
    private List<String> pegs;

    PegSequence(String first, String second,
                String third, String fourth){
        this.pegs = new ArrayList<>(
                Arrays.asList(first, second, third, fourth)
        );
    }

    PegSequence(){
        this.pegs = new ArrayList<>();
    }

    PegSequence(PegSequence first, PegSequence second){
        this.pegs = new ArrayList<>();
        pegs.addAll(first.getPegs());
        pegs.addAll(second.getPegs());
    }

    public List<String> getPegs(){
        return this.pegs;
    }
}
