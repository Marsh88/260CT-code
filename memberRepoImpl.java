//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled 260CT
//  @ File Name : memberRepoImpl.java Customer List
//  @ Date : 17/03/2016 17/03/2015
//  @ Author :  Toby Marshall
//
//




import java.util.ArrayList;

public class memberRepoImpl implements MemberRepo {    
    private ArrayList<Member> members;
        
    public void Repository(){
        members = new ArrayList<Member>();
    }        

    public void addMember(Member memb){
        members.add(memb); 
    } 

    public Member getMembers(int ref){
        return members.get(ref); 
    }
    
    public ArrayList<Member> getAllMembers(){
        return members; 
    } 

    public void updateMember(Member memb){ 
            members.get(memb.getRef()).setName(memb.getName());
            System.out.println("Member Ref: "+ memb.getRef()+ "updated");
    }
    
    public void deleteMember(Member memb){ 
            members.remove(memb.getRef());
            System.out.println("Member Ref: "+ memb.getRef()+ "deleted");
    }

} 

