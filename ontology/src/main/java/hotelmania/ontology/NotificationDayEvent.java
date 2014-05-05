package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: NotificationDayEvent
* @author ontology bean generator
* @version 2014/05/5, 13:17:33
*/
public class NotificationDayEvent implements Predicate {

   /**
* Protege name: dayEvent
   */
   private DayEvent dayEvent;
   public void setDayEvent(DayEvent value) { 
    this.dayEvent=value;
   }
   public DayEvent getDayEvent() {
     return this.dayEvent;
   }

}
