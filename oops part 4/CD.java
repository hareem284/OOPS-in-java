/* =============================================  
   FILENAME: CD.java  
   PURPOSE: Represents a CD with artist and track count.  
   KEY COMPONENTS:  
   - Inherits from Item  
   - Unique fields: artist (String), tracks (int)  
   - Constructor: Sets max checkout days to 14  
   ENCAPSULATION: Private fields with public getters  
   DEPENDS ON: Item.java  
   ============================================= */

import java.time.LocalDate;

public class CD extends Item {
   private String artist;
   private int tracks;

   public CD(String id, String title, LocalDate publicationDate, String artist, int tracks) {
      super(id, title, publicationDate, 14); // CDs: 14-day checkout
      this.artist = artist;
      this.tracks = tracks;
   }

   public String getArtist() {
      return artist;
   }

   public int getTracks() {
      return tracks;
   }
}