import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        this.score = 0;
    }

    public void add(Question question) {
        questions.add(question);
    }
    public void askQuestion(){
        
    }
}
