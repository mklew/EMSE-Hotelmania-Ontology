package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Price
* @author ontology bean generator
* @version 2014/05/16, 00:30:29
*/
public class Price implements Concept {

   /**
* Protege name: price
   */
   private float price;
   public void setPrice(float value) { 
    this.price=value;
   }
   public float getPrice() {
     return this.price;
   }

}
