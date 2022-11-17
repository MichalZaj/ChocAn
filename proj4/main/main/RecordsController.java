package main.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RecordsController {
  static List<Member> memberRecordsArray = new ArrayList<Member>();
  static List<Provider> providerRecordsArray = new ArrayList<Provider>();
  Scanner myScanner = new Scanner(System.in);
  
  public RecordsController() {

  }
  
  public void promptForMemberChanges() {
    System.out.println("Would you like to\n(A) - Add\n(E) - Edit\n(R) - Remove\na member?");
    String input = myScanner.next();
    
    switch (input) {
      case("A"):
        System.out.println("Adding new member. Enter a name");
        String name = myScanner.next();
        Member addition = new Member(name);
        memberRecordsArray.add(addition);
        System.out.println("New member added. Information is as follows:");
        memberRecordsArray.get(memberRecordsArray.size() - 1).printMember();
        System.out.println();
        break;
        
      case("E"):
        System.out.println("Editing member. Enter a member number");
        int memberNum = myScanner.nextInt();
        
       
        boolean memberExists = searchMember(memberNum);
        
        if (memberExists) {
          System.out.println("Member found.");
          System.out.println("(N) - Change name");
          System.out.println("(S) - Suspend member");
          System.out.println("(U) - Unsuspend member");
          input = myScanner.next();
          
          switch (input) {
            case("N"):
              System.out.println("Enter a new name:");
              String newName = myScanner.next();
              changeMemberName(memberNum, newName);
              break;
              
            case("S"):
              System.out.println("Suspending member");
              suspendMember(memberNum);
              break;
              
            case("U"):
              System.out.println("Unsuspending member");
              unSuspendMember(memberNum);
              break;
              
            default:
              System.out.println("Invalid input. Existing to operator menu.");
              break;
              
          }
        } else {
          System.out.println("Member does not exist.");
          System.out.println("Going back to Operator menu");
          break;
        }
        break;
      
      case("R"):
        System.out.println("Removing member. Enter a member number");
        int delMemberNum = myScanner.nextInt();
      
        
        
        boolean delMemberExists = searchMember(delMemberNum);
        
        
        
        if (delMemberExists) {
          System.out.println("Deleting Member");
          deleteMember(delMemberNum);
        } else {
          System.out.println("Member not found");
        }
        break;
        
        
      default:
        System.out.println("Invalid option. Returning to operator menu.");
        break;
    }
  }
  
  public void promptForProviderChanges() {
    
  }
 
  public void addMember(String name) {
    Member addition = new Member(name);
    memberRecordsArray.add(addition);
    
  }
  
  public boolean searchMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        return true;
      }
    }
    return false;
  }
  
  public void changeMemberName(int memberNumber, String newName) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.get(i).setMemberName(newName);
        System.out.print("New name: "); 
        memberRecordsArray.get(i).printMember();
      }
    }
  }
  
  public void suspendMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.get(i).suspendMember(true);
        System.out.println("Member suspended."); 
      }
    }
  }
  
  public void unSuspendMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.get(i).suspendMember(false);
        System.out.println("Member unsuspended."); 
      }
    }
  }
  
  public boolean checkSuspended(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        return memberRecordsArray.get(i).isSuspended();
      }
    }
    return false;
  }
  
  public void deleteMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.remove(i);
      }
    }
  }
  
  public void printMemberList() {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      memberRecordsArray.get(i).printMember();
      System.out.println();
    }
  }
  
  
  
  
  
  
  
  public void addProvider(String name) {
    Provider addition = new Provider(name);
    providerRecordsArray.add(addition);
  }
  
  public boolean searchProvider(int providerNumber) {
    for (int i = 0; i < providerRecordsArray.size(); i++) {
      if (providerRecordsArray.get(i).getProviderNumber() == providerNumber) {
        return true;
      }
    }
    return false;
  }
}
