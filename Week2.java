
package week2;

import java.util.Date;
import java.math.BigDecimal;

public class Week2 {

public class savingsAccount {
    String FirstName;
    String surName;
    Date dob;
    String address;
    String tel;
    String accountNumber;
    String sortCode;
    double balance;
    String email;
    boolean hasOverdraft;
    BigDecimal overdraftLimit;
   
   
   
   
    public void removeOverdraft(){
        hasOverdraft=false;
    }
   
    public void setOverdraft(){
        hasOverdraft=true;
    }
   
    public void deposit(){
        balance = balance + 100;//add 100
        balance+=100;//add 100
        balance++;//add 1 to balance
        balance--;//takes 1 from balance
    }
   
   
}


    
}
