import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Answer {

    static int MAX_ANSWER_LENGTH = 4;

    private RandomnessSource randomness;

    Answer(RandomnessSource randomness){
        this.randomness = randomness;
    }

    Answer(){
        this.randomness = new RandomnessSource(this.colors.size());
    }

    private List<String> colors = new ArrayList<>(
            Arrays.asList(
                    Colors.black,
                    Colors.white,
                    Colors.red,
                    Colors.blue,
                    Colors.green,
                    Colors.orange,
                    Colors.purple)
    );

    List<String> generateRandom(){
        List<String> answers = new ArrayList<>();

        for(int i = 0;i < MAX_ANSWER_LENGTH;i++){
            answers.add(colors.get(this.randomness.getRandom()));
        }

        return answers;
    }
}

class RandomnessSource {
    private int size;

    RandomnessSource(int size){
        this.size = size;
    }

    public int getRandom(){
        Random rand = new Random();
        return rand.nextInt(this.size);
    }
}