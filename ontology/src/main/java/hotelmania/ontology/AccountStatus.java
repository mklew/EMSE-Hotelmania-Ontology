package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: AccountStatus
* @author ontology bean generator
* @version 2014/05/19, 15:56:07
*/
public class AccountStatus implements Predicate {

   /**
* Protege name: account
   */
   private Account account;
   public void setAccount(Account value) { 
    this.account=value;
   }
   public Account getAccount() {
     return this.account;
   }

}
