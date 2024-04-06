package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; // Correct import statement
import org.junit.jupiter.api.DisplayName;
import Models.Book;

import java.util.HashSet;
import java.util.Set;

public class BookTest {
    private Book book;

    @BeforeEach
    void init() {
        book = new Book("Pretty", "author", 100);
    }

    @Test
    @DisplayName("Testing if id is unique for multiple books")
    public void testGetID() {
        Set<Integer> ids = new HashSet<>();
        int numberOfBooks = 100;
        for (int i = 0; i < numberOfBooks; i++) {
            Book newBook = new Book("Pretty", "author", 100);
            // Assert that the ID was not previously added, indicating uniqueness
            assertTrue("ID should be unique", ids.add(newBook.getID()));
        }
    }

    @Test
    @DisplayName("Testing if variables are set correctly")
    public void testVariables() {
        assertEquals("Title should match", "Pretty", book.getTitle());
        assertEquals("Author should match", "author", book.getAuthor());
        assertEquals("Year should match", 100, book.getYear());
    }
}
