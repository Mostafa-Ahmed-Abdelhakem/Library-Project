
package library;

public class LibraryProject {

    public static void main(String[] args) {
        
        // author objects
        Author author1 = new Author("Ali", "+123", "ali@gmail.com");
        Author author2 = new Author("Ahmed",  "+456",  "ahmed@gmail.com");
        Author author3 = new Author("Nour",   "+789",  "nour@gmail.com");
        
       // book objects
        Book book1 = new Book("Algorithms", "5/1/2020", 2, author1);
        Book book2 = new Book("Coding", "2/4/2019", 1, author1);
        Book book3 = new Book("Flutter", "1/1/2022", 3, author2);
        Book book4 = new Book("AI and ML", "6/2/2021", 2, author3);
        
        //libraary object
        Library library = new Library();
        
        // add author objects to authors list
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        
        
        // add book objects to books list
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        
        // print authors info using there id
        library.printAuthor(1);
        library.printAuthor(2);
        library.printAuthor(3);
        
        
        // print books info using there id
        library.printBook(1);
        library.printBook(2);
        library.printBook(3);
        library.printBook(4);
        
        // print authors book using there id
        library.printAuthorBooks(1);
        library.printAuthorBooks(2);
        library.printAuthorBooks(3);
        
        library.removeAuthor(2);
        library.printAuthor(2);
        library.printAuthorBooks(2);
        
    }// end main() method
    
}// end IbraryProject() class
    

