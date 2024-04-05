package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; // Correct import statement
import org.junit.jupiter.api.DisplayName;
import Models.Book;

public class BookTest {
    private Book book;

    @BeforeEach
    void init() {
        book = new Book("Pretty", "author", 100);
    }

    @Test
    @DisplayName("Testing if id is unique")
    public void testGetID() {
        int testId = 1002;
        for (int i = 0; i < 100; i++) {
            int id = new Book("Pretty", "author", 100).getID();
            assertEquals(id, testId++);
        }
    }

    @Test
    @DisplayName("Testing if variables are set correctly")
    public void testVariables() {
        assertEquals(book.getTitle(), "Pretty");
        assertEquals(book.getAuthor(), "author");
        assertEquals(book.getYear(), 100);
    }
}
