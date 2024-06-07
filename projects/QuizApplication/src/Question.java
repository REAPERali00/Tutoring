public class Question {
  private String question;
  private String[] options;
  private char correctAnswer;

  public Question() {
    this(null, null, ' ');
  }

  public Question(String question, String[] options, char correctAnswer) {
    this.question = question;
    this.options = options;
    this.correctAnswer = correctAnswer;
  }

  private String getOptions() {
    char opt = 'A';
    StringBuilder sb = new StringBuilder();
    for (String option : options) {
      sb.append(String.format("%c. %s\n", opt++, option));
    }
    return sb.toString();
  }

  public boolean checkAnswer(char ans) {
    return this.correctAnswer == ans;
  }

  public String getQuestion() {
    return String.format("\n%s \n%s", question, getOptions());
  }

}
