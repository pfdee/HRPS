package entities;

public class Guest {

	private String GuestName;
	private char GuestGender;
	private String GuestCountry;
	private String GuestAddress;
	private String GuestNationality;
	private CreditCard GuestCreditCard;
	private String GuestContact;
	private String GuestIdentity;
	
        public Guest(String name, char gender, String contactNumber) {
            GuestName = name;
            GuestGender = Character.toUpperCase(gender);
            GuestContact = contactNumber;
        }                
                       
	//getters
	public String getGuestName(){
		return this.GuestName;
	}
	
	public char getGuestGender(){
		return this.GuestGender;
	}
	
	public String getGuestCountry(){
		return this.GuestCountry;
	}
	
	public String getGuestAddress(){
		return this.GuestAddress;
	}
	
	public String getGuestNationality(){
		return this.GuestNationality;
	}
	
	public CreditCard getGuestCreditCard(){
		return this.GuestCreditCard;
	}
	
	public String getGuestContact(){
		return this.GuestContact;
	}
	
	public String getGuestIdentity(){
		return this.GuestIdentity;
	}
	
        
	//setters
	public void setGuestName(String Name){this.GuestName = Name ;}
	
	public void setGuestGender(char Gender){this.GuestGender = Gender ;}
	
	public void setGuestCountry(String Country){this.GuestCountry = Country ;}
	
	public void setGuestAddress(String Address){this.GuestAddress = Address ;}
	
	public void setGuestNationality(String Nationality){this.GuestNationality = Nationality ;}
	
	public void setGuestCreditCard(CreditCard CCard){this.GuestCreditCard = CCard ;}
	
	public void setGuestContact(String Contact){this.GuestContact = Contact ;}
	
	public void setGuestIdentity(String Identity){this.GuestIdentity = Identity;}
	
}
