package entities;

import java.util.Scanner;
import java.util.Calendar;

public class CreditCard {

    private long cardNum;
    private String name;
    private int expiryMonth;
    private int expiryYear;
    private String type;
    private String bank;
    
    public CreditCard(long cardNum, String name, int month, int year, String type, String bank){
        this.cardNum = cardNum;
        this.name = name;
        this.expiryMonth = month;
        this.expiryYear = 2000+year;
        this.type = type; //Mastercard, Visa, American Express etc
        this.bank = bank;   
    }   
    
    //getters
    public long getCardNum(){
        return cardNum;
    }
    public String getName() {
        return name;
    }
    public int getExpiryMonth(){
        return expiryMonth;
    }
    public int getExpiryYear() {
        return expiryYear;
    }
    public String getCardType() {
        return type;
    }
    public String getBank(){
        return bank;
    }
    
    public void updateCreditCard(long cardNum, String name, int month, int year, String type, String bank){
        this.cardNum = cardNum;
        this.name = name;
        this.expiryMonth = month;
        this.expiryYear = 2000+year;
        this.type = type; 
        this.bank = bank;   
    }
    
    private boolean checkValidCard() {
      boolean valid = true;
      Calendar cal = Calendar.getInstance();
      int year = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH) + 1;
      if (year == expiryYear) {
          if (expiryMonth < month) valid = false;
          else valid = true;
      } else if (expiryYear < year) {
          valid = false;
      } else {
          valid = true;
      }
      return valid;
    }
    
    /* //test checkValidCard() function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        long cardNum = sc.nextLong();
        CreditCard card1 = new CreditCard(cardNum, "Barack Obama", 03, 18, "Visa", "UOB"); 
        System.out.println(card1.checkValidCard()); //true
        CreditCard card2 = new CreditCard(cardNum, "Barack Obama", 07, 16, "Visa", "UOB");
        System.out.println(card2.checkValidCard()); //true
        CreditCard card3 = new CreditCard(cardNum, "Barack Obama", 02, 16, "Visa", "UOB");
        System.out.println(card3.checkValidCard()); //false
        CreditCard card4 = new CreditCard(cardNum, "Barack Obama", 03, 13, "Visa", "UOB");
        System.out.println(card4.checkValidCard()); //false
        
    }   
    */
    
}

