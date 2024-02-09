public class App {
    public static void main(String[] args) {
        Question q  = new Question("Are you sane?",new String[] {"Yes", "no", "Prefer not to say"}, 'B');
        System.out.println(q.getQuestion());

    }
}
