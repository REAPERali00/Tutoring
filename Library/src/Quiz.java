import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private int maxScore;
    private Scanner input;

    public Quiz() {
        input = new Scanner(System.in);
        questions = new ArrayList<>();
        this.score = 0;
        loadQuestions("quiz.txt");
    }

    public void add(Question question) {
        questions.add(question);
        maxScore++;
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
                System.out.printf("No, %c is not the correct answer.\nTry again!\n\n", ans);
                i--;
                score--;
            }
        }
    }

    private void loadQuestions(String path) {
        String question;
        String options[];
        char correctAnswer;
        try {
            Scanner scan = new Scanner(new File(path));
            while (scan.hasNextLine()) {
                String[] parts = scan.nextLine().split(";");
                if (parts.length < 4)
                    continue;
                question = parts[0];
                correctAnswer = parts[parts.length - 1].toUpperCase().charAt(0);
                options = new String[parts.length - 2];
                for (int i = 1; i < parts.length - 1; i++) {
                    options[i - 1] = parts[i];
                }
                add(new Question(question, options, correctAnswer));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
            e.printStackTrace();
        }
    }

    public void quit() {
        System.out.println("Your score was: " + score + "out of " + maxScore);
        System.out.println("Bye! thanks for participating!");
        input.close();
        System.exit(0);
    }
}
