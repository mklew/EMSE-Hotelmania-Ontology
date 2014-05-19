package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Account
* @author ontology bean generator
* @version 2014/05/19, 15:47:16
*/
public class Account implements Concept {

   /**
* Protege name: balance
   */
   private float balance;
   public void setBalance(float value) { 
    this.balance=value;
   }
   public float getBalance() {
     return this.balance;
   }

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

   /**
* Protege name: id_account
   */
   private int id_account;
   public void setId_account(int value) { 
    this.id_account=value;
   }
   public int getId_account() {
     return this.id_account;
   }

}
