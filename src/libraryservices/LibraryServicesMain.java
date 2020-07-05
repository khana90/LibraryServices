
package libraryservices;

import java.util.Scanner;

/**
 *
 * @author A
 */
public class LibraryServicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String LibraryServices;
        LibraryServices a= new LibraryServices("A jon", "78787878", "dark sky", 5.99);
        LibraryServices b = new LibraryServices("Asad Akil", "444334533", "Golden Earth", 3.49);
      int  count =0;
      
       Scanner sc = new Scanner(System.in);
       String borrowerBook;
       System.out.println("Hello!\n what are looking for?");
       
       borrowerBook= sc.nextLine();
              System.out.println("\n");
           System.out.println("Items in shopping cart are........");
          // System.out.println("\n");
       System.out.println("\nBook 1\n");
           
           System.out.println("Auther name:" + a.getAuthor());
           System.out.println("Isbn:"+ a.getIsbn());
           System.out.println("Book name:" + a.getBookName());
           System.out.println("book price:" + a.getBookPrice());
           
        System.out.println("\nBook 2\n");
        
           System.out.println("Auther name:"+b.getAuthor());
           System.out.println("Isbn: "+b.getIsbn());
           System.out.println("Book name:"+b.getBookName());
           System.out.println("bookPrice:"+ b.getBookPrice());
    }
    
}
