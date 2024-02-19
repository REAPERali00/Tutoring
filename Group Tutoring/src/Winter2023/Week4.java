package Winter2023;

public class Week4 {

    public void sunday() {
        Practice book = new Practice("Introduction to java", "Ali", 12);
        Practice book2 = new Practice();
        book.setName("SQL");
        book.printBook();
        book2.printBook();
        System.out.println(book2);
    }

    public static void main(String[] args) {
        new Week4().sunday();
    }
}
