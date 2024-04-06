package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Models.Book;
import Models.Library;

public class LibraryTest {
    private Library library;
    private Book book;
    private int bookId;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("J.K. Rowling", "Harry Potter", 1900);
        library.addBook(book); // Ensure the book is added to the library for all tests
        bookId = book.getID(); // Retrieve the ID of the newly added book
    }

    @Test
    @DisplayName("Verify that adding a book to the library includes it in the collection")
    public void testAddBook() {
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    @DisplayName("Ensure removing a book from the library excludes it from the collection")
    public void testRemoveBook() {
        library.removeBook(book);
        assertFalse(library.getBooks().contains(book));
    }

    @Test
    @DisplayName("Check borrowing a book by ID makes it part of the borrowed books collection")
    public void testBorrowBookById() {
        Book borrowedBook = library.borrowBook(bookId);
        assertEquals(book, borrowedBook);
        assertTrue(library.getBorrowedBooks().contains(borrowedBook));
    }

    @Test
    @DisplayName("Test returning a book by ID removes it from the borrowed books collection")
    public void testReturnBookById() {
        library.borrowBook(bookId); // Ensure the book is borrowed before attempting to return
        Book returnedBook = library.returnBook(bookId);
        assertEquals(book, returnedBook);
        assertFalse(library.getBorrowedBooks().contains(returnedBook));
    }

    @Test
    @DisplayName("Verify borrowing a book by title adds it to the borrowed books collection")
    public void testBorrowBookByTitle() {
        Book borrowedBook = library.borrowBook(book.getTitle());
        assertEquals(book, borrowedBook);
        assertTrue(library.getBorrowedBooks().contains(borrowedBook));
    }

    @Test
    @DisplayName("Ensure returning a book by title removes it from the borrowed books collection")
    public void testReturnBookByTitle() {
        library.borrowBook(book.getTitle()); // Ensure the book is borrowed before attempting to return
        Book returnedBook = library.returnBook(book.getTitle());
        assertEquals(book, returnedBook);
        assertFalse(library.getBorrowedBooks().contains(returnedBook));
    }

    @Test
    @DisplayName("Verify adding a book increases library size")
    public void testAddBookIncreasesSize() {
        int initialSize = library.getBooks().size();
        library.addBook(new Book("Herman Melville", "Moby Dick", 1851));
        assertEquals(initialSize + 1, library.getBooks().size());
    }

    @Test
    @DisplayName("Attempt to add a duplicate book and verify it doesn't increase library size")
    public void testAddDuplicateBook() {
        int initialSize = library.getBooks().size();
        library.addBook(book); // Attempt to add the same book again
        assertEquals("Library size should remain unchanged when adding a duplicate book", initialSize,
                library.getBooks().size());
    }

    @Test
    @DisplayName("Attempt to remove a book not in the library")
    public void testRemoveNonexistentBook() {
        Book nonexistentBook = new Book("Nonexistent Author", "Nonexistent Title", 1900);
        library.removeBook(nonexistentBook);
        assertFalse("Nonexistent book removal should not affect the library",
                library.getBooks().contains(nonexistentBook));
    }

    @Test
    @DisplayName("Attempt to borrow a book by a nonexistent ID")
    public void testBorrowBookByNonexistentId() {
        assertNull("Borrowing with a nonexistent ID should return null", library.borrowBook(Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("Attempt to return a book by a nonexistent ID")
    public void testReturnBookByNonexistentId() {
        assertNull("Returning with a nonexistent ID should return null", library.returnBook(Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("Attempt to borrow an already borrowed book")
    public void testBorrowAlreadyBorrowedBook() {
        library.borrowBook(book.getTitle()); // Borrow the book first
        assertNull("Attempting to borrow an already borrowed book should return null",
                library.borrowBook(book.getTitle()));
    }

    @Test
    @DisplayName("Attempt to return a book not borrowed")
    public void testReturnNotBorrowedBook() {
        assertNull("Attempting to return a book that wasn't borrowed should return null",
                library.returnBook(book.getTitle()));
    }
}
