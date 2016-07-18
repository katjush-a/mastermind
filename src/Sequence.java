import java.util.ArrayList;
import java.util.List;

class Sequence{
    private List<String> answer, guess;

    Sequence(List<String> answer, List<String> guess) {
        this.answer = answer;
        this.guess = guess;
    }

    List<String> getComparison(){
        List<String> perfectMatches = new ArrayList<>();
        List<String> partialMatches = new ArrayList<>();

        this.detectMatches(perfectMatches, partialMatches);
        return this.buildResponse(perfectMatches, partialMatches);
    }

    private void detectMatches(List<String> perfect, List<String> partial){
        this.guess.forEach(pin -> {
            int position = this.guess.indexOf(pin);

            if (this.answer.get(position).equals(pin)){
                perfect.add(Colors.black);
            } else if (this.answer.contains(pin)){
                partial.add(Colors.white);
            }
        });
    }

    private List<String> buildResponse(List<String> perfect, List<String> partial){
        List<String> response = new ArrayList<>();
        response.addAll(perfect);
        response.addAll(partial);
        while (response.size() < 4){response.add("0"); }
        return response;
    }
}