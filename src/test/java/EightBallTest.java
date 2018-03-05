import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private EightBall myAnswers;

    @Before
    public void before(){
        ArrayList<String> testAnswers = new ArrayList<>();
        testAnswers.add("It is certain");
        testAnswers.add("Ask again later");
        testAnswers.add("Don't count on it");
        this.myAnswers = new EightBall(testAnswers);
    }

    @Test
    public void canGetRandom(){
        ArrayList<String> copy = myAnswers.getAnswers();
        String randomAnswer = myAnswers.getRandomAnswer();
        assertTrue(copy.contains(randomAnswer));
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(3, myAnswers.getAnswerCount());
    }

    @Test
    public void canAddAnswerToList(){
        myAnswers.addAnswer("My reply is no");
        assertEquals(4, myAnswers.getAnswerCount());
    }

    @Test
    public void canRemoveAnswerFromList() {
        myAnswers.removeAnswer("It is certain");
        assertEquals(2, myAnswers.getAnswerCount());
    }
}
