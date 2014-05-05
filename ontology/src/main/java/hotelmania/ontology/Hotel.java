package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Hotel
* @author ontology bean generator
* @version 2014/05/5, 13:17:33
*/
public class Hotel implements Concept {

   /**
* Protege name: hotel_name
   */
   private String hotel_name;
   public void setHotel_name(String value) { 
    this.hotel_name=value;
   }
   public String getHotel_name() {
     return this.hotel_name;
   }

}
