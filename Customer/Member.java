//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled 260CT
//  @ File Name : Member.java Customer List
//  @ Date : 17/03/2016 17/03/2015
//  @ Author :  Toby Marshall
//
//




public class Member extends nonMember{
	private String contactDetails = "";
	private String Address = "";
	private String UserID = "";
	private String Password = "";
        
	
        
        public String getContactDetails() {
	return contactDetails;
	}
	
	public String getAddress() {
	return Address;
	}
	
	public String getUserID() {
	return UserID;
	}
	
	public void setContatctDetails(String aContact) {
            contactDetails = aContact;
	
	}
	
	public void setAddress(String aAdress) {
	Address = aAdress;
	}
	
	public void setUserID(String aUserID) {
	UserID = aUserID;
	}
        
        public String getPassword(){
            return Password;
        }
        public void  setPassword(String aPassword){
            Password = aPassword;
            
        }
        
}
