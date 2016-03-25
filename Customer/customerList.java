//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled 260CT
//  @ File Name : customerList.java Customer List
//  @ Date : 17/03/2016 17/03/2015
//  @ Author :  Toby Marshall
//
//
import java.util.ArrayList;


public class customerList {
	//private nonMember[] pList;
        //private Member[] pList1;
        private int refCount = -1;
        ArrayList<Member> members = new ArrayList<Member>(); //creates new entities of the arrays and classes
        memberRepoImpl rep = new memberRepoImpl(); 
        ArrayList<nonMember> nonmembers = new ArrayList<nonMember>();
        nonmemberRepoImpl nonrep = new nonmemberRepoImpl();
        
  
        public customerList(){ //initilises the repositories
        rep.Repository();            
        nonrep.nonRepository();
    }

	
        public void addNewMember(String name, String paymentinfo,String contactDet, String address,String ID,String Pass ) { //method to add a new member by creating a new class and changing the attributes

	Member memb = new Member();
        refCount++;
        memb.setName(name);
        memb.setAddress(address);
        memb.setContatctDetails(contactDet);
        memb.setPaymentInformation(paymentinfo);
        memb.setRef(refCount);
        memb.setUserID(ID);
        memb.setPassword(Pass);
        memb.setisMember();
        
        rep.addMember(memb);
        

        
	}
	
	public void addNewNonMember( String name,String paymentinfo) { //same as add member

	nonMember nonmemb = new nonMember();
        refCount++;
        nonmemb.setName(name);
        nonmemb.setPaymentInformation(paymentinfo);
        nonmemb.setRef(refCount);       
        nonrep.addNonMember(nonmemb);
	}
	
	
	public void viewCustomer(int ref) { //prints out the customer as long as it's in either list
	if ((findMember(ref)==1)&&(ref != -1)){ //if find member returns is member
                Member mem = rep.getMembers(ref);
                System.out.println("Name:"+mem.getName());
                System.out.println("payment information:"+mem.getPaymentInformation());
                System.out.println("Contact details:"+mem.getContactDetails());
                System.out.println("Address:"+mem.getAddress());
                System.out.println("User ID:"+mem.getUserID());
                System.out.println("Password:"+mem.getPassword());
                System.out.println("Ref:"+ref);
            
        }
        else if ((findnonMember(ref)==0 )&& (ref !=-1)){
                nonMember non = nonrep.getNonMembers(ref);
                System.out.println("Name:"+non.getName());
                System.out.println("payment information:"+non.getPaymentInformation());
                System.out.println("Ref:"+ref);
        
        }
        else{
            System.out.println("not found ");
        }
	}
	
	public int findnonMember(int ref) { //use repo to go through list till it finds a match
        for(nonMember nome:nonrep.getAllNonMembers()){
            if (nome.getRef()==ref){
            return nome.getIsMember();
        }
        }
        return -1;
    }
       
        public int findMember(int ref) {
        for(Member mem:rep.getAllMembers()){
            if (mem.getRef()==ref){
            return mem.getIsMember();
        }
        }
        return -1;
        }

        public void deleteMem(int ref) { //use repo to delete a member
        for(Member mem:rep.getAllMembers()){
            if (mem.getRef()==ref){
            rep.deleteMember(mem);
        }
        }


    }
        
        public void deleteNonMem(int ref) {
        for(nonMember nome:nonrep.getAllNonMembers()){
            if (nome.getRef()==ref){
            nonrep.deleteNonMember(nome);
        }
        }
    }
       
    
        public void viewNonMembers(){ //for who list, view all non Members
        for(nonMember nome : nonrep.getAllNonMembers()){
            if (nome.getRef()!= -1){
                System.out.print(nome.getRef() + "\t");
                System.out.println("Name:"+nome.getName());
                System.out.println("payment information:"+nome.getPaymentInformation());  
                System.out.println("Ref:"+nome.getRef());
               
           }
        } 
          
    }    
        
        public void viewMembers(){
        for( Member memb : rep.getAllMembers()){
            if (memb.getRef()!= -1){
                System.out.println("Name:"+memb.getName());
                System.out.println("payment information:"+memb.getPaymentInformation());
                System.out.println("Contact details:"+memb.getContactDetails());
                System.out.println("Address:"+memb.getAddress());
                System.out.println("User ID:"+memb.getUserID());
                System.out.println("Password:"+memb.getPassword());
                System.out.println("Ref:"+memb.getRef());
            
            }
        }  
    }


}
