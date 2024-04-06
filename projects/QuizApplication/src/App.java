public class App {
    static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) throws Exception {
        // Quiz quiz = new Quiz();
        // quiz.askQuestions();
        // quiz.quit();
        System.out.println(0x14 + 012);
        int reallyLongVarName;
    }
}
