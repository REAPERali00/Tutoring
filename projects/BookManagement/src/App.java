import java.util.Random;

import Models.Book;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            int id = new Book("Pretty", "author", 100).getID();
            System.out.println(id);
        }
    }
}
