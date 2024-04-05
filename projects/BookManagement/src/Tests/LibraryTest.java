package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Models.Book;
import Models.Library;

public class LibraryTest {
    private Library library;
    private Book book;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("J.K. Rowling", "Harry Potter", 1);
    }

    @Test
    public void testAddBook() {
        library.addBook(book);
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testRemoveBook() {
        library.addBook(book);
        library.removeBook(book);
        assertFalse(library.getBooks().contains(book));
    }

    @Test
    public void testBorrowBookById() {
        library.addBook(book);
        Book borrowedBook = library.borrowBook(1001);
        assertEquals(book, borrowedBook);
        assertTrue(library.getBorrowedBooks().contains(borrowedBook));
    }

    @Test
    public void testReturnBookById() {
        library.addBook(book);
        library.borrowBook(1);
        Book returnedBook = library.returnBook(1001);
        assertEquals(book, returnedBook);
        assertFalse(library.getBorrowedBooks().contains(returnedBook));
    }

    @Test
    public void testBorrowBookByTitle() {
        library.addBook(book);
        Book borrowedBook = library.borrowBook("Harry Potter");
        assertEquals(book, borrowedBook);
        assertTrue(library.getBorrowedBooks().contains(borrowedBook));
    }

    @Test
    public void testReturnBookByTitle() {
        library.addBook(book);
        library.borrowBook("Harry Potter");
        Book returnedBook = library.returnBook("Harry Potter");
        assertEquals(book, returnedBook);
        assertFalse(library.getBorrowedBooks().contains(returnedBook));
    }
}