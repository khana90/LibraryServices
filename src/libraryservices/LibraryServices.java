
package libraryservices;

/**
 *
 * @author A
 */
public class LibraryServices {
    private String Author;
    private String Isbn;
    private String BookName;
    private double bookPrice;
    
    public LibraryServices(String Author, String Isbn, String BookName, double bookPrice) {
        this.Author = Author;
        this.Isbn = Isbn;
        this.BookName = BookName;
        this.bookPrice= bookPrice;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
      public double getBookPrice(){
        return bookPrice;
    }
    public void setBookPrice(double bookPrice){
        this.bookPrice = bookPrice;
    }
    
    
    public String toString(){
        return("Author of book"+Author)
                +("Book Isbn"+Isbn)
                +("book name"+BookName)
                +("book price"+bookPrice);
        
    }
    
}
