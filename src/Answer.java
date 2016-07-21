import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Answer {

    RandomnessSource randomness;

    Answer(){
        this.randomness = new RandomnessSource(this.colors.size());
    }
    Answer(RandomnessSource randomness){
        this.randomness = randomness;
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