import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private Scanner input;

    public Quiz() {
        input = new Scanner(System.in);
        questions = new ArrayList<>();
        this.score = 0;
        injectData();
    }

    public void add(Question question) {
        questions.add(question);
    }

    public char getChoice() {
        System.out.print("your choice: ");
        return input.next().toUpperCase().charAt(0);
    }

    public void askQuestions() {
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println(q.getQuestion());
            char ans = getChoice();
            if (q.checkAnswer(ans)) {
                System.out.println("you got it right!");
                score++;

            } else {
                System.out.printf("No, %c is not the correct answer.\nTry again!", ans);
                i--;
                score--;
            }
        }
        System.out.println("Your score was: " + score);
    }

    public void injectData() {
        questions.add(new Question("Are you sane?", new String[] { "Yes", "no", "Prefer not to say" }, 'B'));
    }

    public void quit() {
        System.out.println("Your score was: " + score);
        System.out.println("Bye! thanks for participating!");
        input.close();
        System.exit(0);
    }
}
