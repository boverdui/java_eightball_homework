import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public ArrayList<String> getAnswers(){
        ArrayList<String> copyOfAnswers = new ArrayList<>(this.answers);
        return copyOfAnswers;
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.answers);
        return getAnswerAtIndex(0);
    }

    public String getAnswerAtIndex(int index){
        return this.answers.get(index);
    }

    public int getAnswerCount(){
        return this.answers.size();
    }

    public void addAnswer(String answer){
        this.answers.add(answer);
    }

    public void removeAnswer(String answer){
        this.answers.remove(answer);
    }

}
