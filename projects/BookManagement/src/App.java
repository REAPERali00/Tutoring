import java.util.Random;

import Models.Book;
import Models.Library;

public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book("J.K. Rowling", "Harry Potter", 1900);
        Library lib = new Library();
        lib.addBook(book);
        System.out.println(lib);
    }
}
