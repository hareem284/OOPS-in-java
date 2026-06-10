
/* =============================================  
   FILENAME: DVD.java  
   PURPOSE: Represents a DVD with director and runtime.  
   KEY COMPONENTS:  
   - Inherits from Item  
   - Unique fields: director (String), runningTime (int)  
   - Constructor: Sets max checkout days to 7  
   ENCAPSULATION: Private fields with public getters  
   DEPENDS ON: Item.java  
   ============================================= */
import java.time.LocalDate;

public class DVD extends Item {
   private String director;
   private int runningTime;

   public DVD(String id, String title, LocalDate publicationDate, String director, int runningTime) {
      super(id, title, publicationDate, 7); // DVDs: 7-day checkout
      this.director = director;
      this.runningTime = runningTime;
   }

   public String getDirector() {
      return director;
   }

   public int getRunningTime() {
      return runningTime;
   }
}