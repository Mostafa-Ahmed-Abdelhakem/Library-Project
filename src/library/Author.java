
package library;

public class Author {
    
    // Author attributes
    protected int id;
    protected String name;
    protected String phone;
    protected String email;
    
    private static int idCounter = 0;
    
    // class constructor
    public Author(String name, String phone, String email) {
        idCounter++;
        id = idCounter;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }// end constructor
      
}// end Author() class
