
/* =============================================  
   FILENAME: Main.java  
   PURPOSE: Test the library system with sample data.  
   TEST SCENARIO:  
   1. Create a book, DVD, and CD.  
   2. Create patron "Alice" and check out items.  
   3. Return one item and print updated counts.  
   EXPECTED OUTPUT:  
   - Alice's checked-out items: 2 → 1 after return  
   DEPENDS ON: Item.java, Book.java, DVD.java, CD.java, Patron.java  
   ============================================= */
import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      // Create items
      Book book = new Book("B001", "1984", LocalDate.of(1949, 6, 8), "George Orwell", 328);
      DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
      CD cd = new CD("C001", "Thriller", LocalDate.of(1982, 11, 30), "Michael Jackson", 9);

      // Create patron Alice
      Patron alice = new Patron("Alice", 1234);
      alice.checkOutItem(book);
      alice.checkOutItem(dvd);
      System.out.println("Alice's checked-out items: " + alice.getNumItemsCheckedOut()); // Output: 2

   }

}