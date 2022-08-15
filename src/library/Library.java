
package library;

import java.util.ArrayList;

public class Library {
    
    ArrayList<Author> authors = new ArrayList();
    ArrayList<Book> books = new ArrayList();
    
    
    public void addAuthor(Author author) {
        authors.add(author);
    }// end addAuthor() method
    
    
    public void removeAuthor(int id) {
        for (Author author:authors) {
            if (author.id == id) {
                authors.remove(author);
                return;
            }// end if condition
        }// end for loop
        // if the author not found
        System.out.println("Author with this id: " + id + " is not found!!");
        System.out.println("----------------------");
    }// end removeAuthor() method
    
    
    public void printAuthor(int id) {
        for (Author author: authors) {
            if (author.id == id) {
                System.out.println("Author with id: " + id + " information");
                System.out.println("Name: " + author.name );
                System.out.println("Phone: " + author.phone);
                System.out.println("Email: " + author.email);
                System.out.println("----------------------");
                return;
            }// end if condition
        }// end for loop
        
        // if the author not found
        System.out.println("Author with this id: " + id + " is not found!");
        System.out.println("----------------------");
    }// end printAuthor() method
    
    
    public void printAuthorBooks(int id) {
        boolean isAuthorExist = false;
        String authorName = "";
        for (Author author: authors) {
            if (author.id == id) {
                isAuthorExist = true;
                authorName = author.name;
                break;
            }// end if condition
        }// end for loop
        // if author not found
        if (!isAuthorExist) {
            System.out.println("Author with this id: " + id + " is not found!");
            System.out.println("----------------------");
            return;
        }// end if condition
        // print Author books
        System.out.println("Books of author " + authorName + ": ");
        for (Book book: books) {
            if (book.author.id == id) {
                System.out.println("- " + book.title);
            }// end if condition
        }// end for loop
        System.out.println("----------------------");
    }// end printAuthorBooks() method
    
    
    public void addBook(Book book) {
        books.add(book);
    }// end addBook() method
    
    
    public void removeBook(int id) {
        for (Book book: books) {
            if (book.id == id) {
                books.remove(book);
                return;
            }// end if condition
        }// end for loop
        
        // if the book not found
        System.out.println("Book with this id: " + id + " is not found!");
        System.out.println("----------------------");
    }// end removeBook() method
    
    
    public void printBook(int id) {
        for (Book book: books) {
            if (book.id == id) {
                System.out.println("Book with id " + id + " information");
                System.out.println("Title: " + book.title);
                System.out.println("Version: " + book.version);
                System.out.println("Publishing date: " + book.publishingDate);
                System.out.println("Author: " + book.author.name);
                System.out.println("----------------------");
                return;
            }// end if condition
        }// end for loop
        
        // if the books not found
        System.out.println("Book with id " + id + " is not found!");
        System.out.println("----------------------");
    }// end pirntBook() method
     
}// end Library() class
