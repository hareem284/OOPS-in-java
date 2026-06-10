
/* =============================================  
   FILENAME: Item.java  
   PURPOSE: Base class for all library items (books, DVDs, CDs).  
   KEY COMPONENTS:  
   - Abstract class with shared fields: ID, title, publication date, max checkout days  
   - Encapsulation: Private fields with public getters  
   INHERITED BY: Book.java, DVD.java, CD.java  
   ============================================= */
//Imports the LocalDate class.
//Used to store publication dates such as book release dates.
import java.time.LocalDate;

abstract class Item {
   private String id;
   private String title;
   private LocalDate publicationDate;
   private int maxcheckoutdays;

   // making the constructor
   public Item(String id, String title, LocalDate publicationDate, int maxcheckoutdays) {
      this.id = id;
      this.title = title;
      this.publicationDate = publicationDate;
      this.maxcheckoutdays = maxcheckoutdays;
   }

   public String get_id() {
      return id;
   }

   public String get_title() {
      return title;
   }

   public LocalDate get_publication_date() {
      return publicationDate;
   }

   public int get_maxcheckoutdays() {
      return maxcheckoutdays;
   }
}
