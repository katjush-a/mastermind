import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void generatesRandomInt(){
        RandomnessSource source = new TestRandomnessSource(3, 6, 4, 2);

        assertEquals(3, source.getRandom());
        assertEquals(6, source.getRandom());
        assertEquals(4, source.getRandom());
        assertEquals(2, source.getRandom());
    }

    @Test
    public void generatesAnswer(){
        RandomnessSource source = new TestRandomnessSource(4, 2, 3, 1);
        Answer answer = new Answer(source);

        List<String> expected = new PegSequence(
                Colors.green,Colors.red,Colors.blue,Colors.white
        ).getPegs();

        assertEquals(expected, answer.generateRandom());
    }

    @Test
    public void generatesAnotherAnswer(){
        RandomnessSource source = new TestRandomnessSource(5, 3, 6, 1);
        Answer answer = new Answer(source);

        List<String> expected = new PegSequence(
                Colors.orange,Colors.blue,Colors.purple,Colors.white
        ).getPegs();

        assertEquals(expected, answer.generateRandom());
    }
}


class TestRandomnessSource extends RandomnessSource {

    private ArrayList<Integer> numbers;
    private int iterator = -1;

    TestRandomnessSource(int first, int second, int third, int fourth) {
        super(1);
        this.numbers = new ArrayList<>(
                Arrays.asList(first, second, third, fourth)
        );
    }

    @Override
    public int getRandom(){
        iterator++;
        return numbers.get(iterator);
    }

}