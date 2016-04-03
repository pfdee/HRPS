package entities;

public class Guest {

	private String guestName;
	private char guestGender;
	private String guestCountry;
	private String guestAddress;
	private String guestNationality;
	private CreditCard guestCreditCard;
	private String guestContact;
	private String guestIdentity;
	
        public Guest(String name, char gender, String contactNumber) {
            guestName = name;
            guestGender = Character.toUpperCase(gender);
            guestContact = contactNumber;
        }                
                       
	//getters
	public String getGuestName(){
		return this.guestName;
	}
	
	public char getGuestGender(){
		return this.guestGender;
	}
	
	public String getGuestCountry(){
		return this.guestCountry;
	}
	
	public String getGuestAddress(){
		return this.guestAddress;
	}
	
	public String getGuestNationality(){
		return this.guestNationality;
	}
	
	public CreditCard getGuestCreditCard(){
		return this.guestCreditCard;
	}
	
	public String getGuestContact(){
		return this.guestContact;
	}
	
	public String getGuestIdentity(){
		return this.guestIdentity;
	}
	
        
	//setters
	public void setGuestName(String Name){this.guestName = Name ;}
	
	public void setGuestGender(char Gender){this.guestGender = Gender ;}
	
	public void setGuestCountry(String Country){this.guestCountry = Country ;}
	
	public void setGuestAddress(String Address){this.guestAddress = Address ;}
	
	public void setGuestNationality(String Nationality){this.guestNationality = Nationality ;}
	
	public void setGuestCreditCard(CreditCard CCard){this.guestCreditCard = CCard ;}
	
	public void setGuestContact(String Contact){this.guestContact = Contact ;}
	
	public void setGuestIdentity(String Identity){this.guestIdentity = Identity;}
	
}
