
package library;

public class Book {
    
    // Author attributes
    protected int id;
    protected String title;
    protected String publishingDate;
    protected int version;
    protected Author author;
    
    private static int idCounter = 0;
    
    // class constructor
    public Book(String title, String publishingDate, int version, Author author) {
        idCounter ++;
        id = idCounter;
        this.title = title;
        this.publishingDate = publishingDate;
        this.version = version;
        this.author = author;
    }// end constructor
    
}// end Book() class
