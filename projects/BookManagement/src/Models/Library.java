package Models;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Book> borrowedBooks;

    public Library() {
        books = new ArrayList<Book>();
        borrowedBooks = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        if (!books.contains(book))
            books.add(book);
    }

    public void removeBook(Book book) {
        if (books.contains(book))
            books.remove(book);
    }

    public Book borrowBook(int id) {
        Book book = searchBook(id);
        if (book != null && !borrowedBooks.contains(book)) {
            borrowedBooks.add(book);
            return book;
        }
        return null;
    }

    public Book returnBook(int id) {
        Book book = searchBook(id);
        if (book != null && borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            return book;
        }
        return null;
    }

    public Book borrowBook(String title) {
        Book book = searchBook(title);
        if (book != null && !borrowedBooks.contains(book)) {
            borrowedBooks.add(book);
            return book;
        }
        return null;
    }

    public Book returnBook(String title) {
        Book book = searchBook(title);
        if (book != null && borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            return book;
        }
        return null;
    }

    private Book searchBook(int id) {
        for (Book book : books) {
            if (book.getID() == id) {
                return book;
            }
        }
        return null;
    }

    private Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < books.size(); i++) {
            sb.append(books.get(i) + "\n");
        }
        return sb.toString();
    }
}
