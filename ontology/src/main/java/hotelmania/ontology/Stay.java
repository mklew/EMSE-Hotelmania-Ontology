package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Stay
* @author ontology bean generator
* @version 2014/05/19, 15:19:23
*/
public class Stay implements Concept {

   /**
* Protege name: checkOut
   */
   private int checkOut;
   public void setCheckOut(int value) { 
    this.checkOut=value;
   }
   public int getCheckOut() {
     return this.checkOut;
   }

   /**
* Protege name: checkIn
   */
   private int checkIn;
   public void setCheckIn(int value) { 
    this.checkIn=value;
   }
   public int getCheckIn() {
     return this.checkIn;
   }

}
