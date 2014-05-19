package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: DayEvent
* @author ontology bean generator
* @version 2014/05/19, 15:19:23
*/
public class DayEvent implements Concept {

   /**
* Protege name: day
   */
   private int day;
   public void setDay(int value) { 
    this.day=value;
   }
   public int getDay() {
     return this.day;
   }

}
