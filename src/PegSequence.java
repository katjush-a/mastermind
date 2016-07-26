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

    public List<String> getPegs(){
        return this.pegs;
    }
}
