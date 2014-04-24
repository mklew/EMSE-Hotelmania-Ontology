package hotelmania.ontology;


import jade.content.*;

/**
* Protege name: RegistrationRequest
* @author ontology bean generator
* @version 2014/04/19, 16:33:09
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
