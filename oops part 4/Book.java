
/* =============================================  
   FILENAME: Book.java  
   PURPOSE: Represents a book with author and pages.  
   KEY COMPONENTS:  
   - Inherits from Item  
   - Unique fields: author (String), pages (int)  
   - Constructor: Sets max checkout days to 21  
   ENCAPSULATION: Private fields with public getters  
   DEPENDS ON: Item.java  
   ============================================= */
import java.time.LocalDate;

class Book extends Item {
   private String author;
   private int num_pages;

   // creating the constructor of the child class Book
   public Book(String id, String title, LocalDate publicationDate, String author, int pages) {
      super(id, title, publicationDate, 21); // Books: 21-day checkout
      this.author = author;
      this.num_pages = pages;
   }

   // returning author and num_pages
   public String get_author() {
      return author;
   }

   public int get_numpages() {
      return num_pages;
   }
}
