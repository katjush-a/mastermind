import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerTest {

    @Test
    public void generatesRandomInt(){
        RandomnessSource expected = new TestRandomnessSource();

        assertEquals(7, expected.getRandom());
    }
}

class TestRandomnessSource extends RandomnessSource {
    TestRandomnessSource() {
        super(1);
    }

    @Override
    public int getRandom(){
        return 7;
    }

    //@Test
    //public void generatesAnswer(){
    //    Answer answer = new Answer;
    //}
}