package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: RegistrationRequest
* @author ontology bean generator
* @version 2014/05/5, 13:17:33
*/
public class RegistrationRequest implements AgentAction {

   /**
* Protege name: hotel
   */
   private Hotel hotel;
   public void setHotel(Hotel value) { 
    this.hotel=value;
   }
   public Hotel getHotel() {
     return this.hotel;
   }

}
