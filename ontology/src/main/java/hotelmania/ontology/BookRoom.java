package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: BookRoom
* @author ontology bean generator
* @version 2014/05/23, 22:29:18
*/
public class BookRoom implements AgentAction {

   /**
* Protege name: stay
   */
   private Stay stay;
   public void setStay(Stay value) { 
    this.stay=value;
   }
   public Stay getStay() {
     return this.stay;
   }

   /**
* Protege name: price
   */
   private Price price;
   public void setPrice(Price value) { 
    this.price=value;
   }
   public Price getPrice() {
     return this.price;
   }

}
