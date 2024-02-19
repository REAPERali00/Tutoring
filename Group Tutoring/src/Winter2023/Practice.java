package Winter2023;

/**
 * For this class we want to practice making the structure of the class:
 * What is our goal? make a class called Book, the book has a name, author, and
 * page number.
 * make a method that prints the books information!
 * Bonus points: write a method that reader a review of the book form the user!
 */
public class Practice {
    // Make the Variable Declarations:
    private String name;
    private String author_name;
    private int page_number;

    // Make the constructor
    // Default Construct
    public Practice() {
        this("book", " ", 1);
        // name = "Book";
        // author_name = " ";
        // page_number = 1;
    }

    public Practice(String name, String author_name, int page_number) {
        this.name = name;
        this.author_name = author_name;
        this.page_number = page_number;
    }

    // Make the getter/setter:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void setAuthorName(String author_name) {
        this.author_name = author_name;
    }

    public int getPageNumber() {
        return page_number;
    }

    public void setPageNumber(int page_number) {
        this.page_number = page_number;
    }

    // Make the toString Method:
    public void printBook() {
        System.out.printf("hi %s your book is %s\nYour at page number %d\n", author_name, name, page_number);
        // System.out.println("hi " + author_name + " your book is: " + name);
    }

    public String toString() {
        return String.format("%s your book is %s\nYour at page number %d\n", author_name, name, page_number);
    }
    // Make the worker method:

}
