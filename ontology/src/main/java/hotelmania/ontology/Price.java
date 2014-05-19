package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Price
* @author ontology bean generator
* @version 2014/05/19, 15:56:07
*/
public class Price implements Concept {

   /**
* Protege name: amount
   */
   private float amount;
   public void setAmount(float value) { 
    this.amount=value;
   }
   public float getAmount() {
     return this.amount;
   }

}
