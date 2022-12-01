package main.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class controls access to records.

 * @author cpaier
 *
 */

public class RecordsController {
  static List<Member> memberRecordsArray = new ArrayList<Member>();
  static List<Provider> providerRecordsArray = new ArrayList<Provider>();
  Scanner myScanner = new Scanner(System.in);
  
  /**
   * Constructor.
   */
  public RecordsController() {

  }
  
  /**
   * Handles changes to member records.
   */
  public void promptForMemberChanges() {
    System.out.println("Would you like to\n(A) - Add\n(E) - Edit\n(R) - Remove\na member?");
    String input = myScanner.next();
    
    switch (input) {
      case("A"):
        System.out.println("Adding new member. Enter a name");
        String name = myScanner.next();
        name.length();
        
        System.out.print("Enter a street address: ");
        myScanner.nextLine();
        String address = myScanner.nextLine();
        System.out.println();
        address.length();
        
        System.out.print("Enter a city: ");
        //myScanner.nextLine();
        String city = myScanner.nextLine();
        System.out.println();
        city.length();
        
        System.out.print("Enter a state: ");
        String state = myScanner.nextLine();
        System.out.println();
        state.length();
        
        System.out.print("Enter a zip: ");
        String zip = myScanner.next();
        System.out.println();
        
        Member addition = new Member(name, address, city, state, zip);
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
  
  /**
   * Manages provider changes.
   */
  public void promptForProviderChanges() {
    System.out.println("Would you like to\n(A) - Add\n(E) - Edit\n(R) - Remove\na provider?");
    String input = myScanner.next();
    
    switch (input) {
      case("A"):
        System.out.println("Adding new provider. Enter a name");
        String name = myScanner.next();
        name.length();
        
        System.out.print("Enter a street address: ");
        myScanner.nextLine();
        String address = myScanner.nextLine();
        System.out.println();
        address.length();
        
        System.out.print("Enter a city: ");
        //myScanner.nextLine();
        String city = myScanner.nextLine();
        System.out.println();
        city.length();
        
        System.out.print("Enter a state: ");
        //myScanner.nextLine();
        String state = myScanner.nextLine();
        System.out.println();
        state.length();
        
        System.out.print("Enter a zip: ");
        String zip = myScanner.next();
        System.out.println();
        
        Provider addition = new Provider(name, address, city, state, zip);
        providerRecordsArray.add(addition);
        System.out.println("New provider added. Information is as follows:");
        providerRecordsArray.get(providerRecordsArray.size() - 1).printProvider();
        System.out.println();
        break;
        
      case("E"):
        System.out.println("Editing provider. Enter a provider number");
        int providerNum = myScanner.nextInt();
        
       
        boolean providerExists = searchProvider(providerNum);
        
        if (providerExists) {
          System.out.println("Provider found.");
          System.out.println("(N) - Change name");
          System.out.println("(C) - Cancel");
          input = myScanner.next();
          
          switch (input) {
            case("N"):
              System.out.println("Enter a new name:");
              String newName = myScanner.next();
              changeProviderName(providerNum, newName);
              break;
              
            default:
              System.out.println("Invalid input. Existing to operator menu.");
              break;
              
          }
        } else {
          System.out.println("Provider does not exist.");
          System.out.println("Going back to Operator menu");
          break;
        }
        break;
      
      case("R"):
        System.out.println("Removing provider. Enter a provider number");
        int delProviderNum = myScanner.nextInt();
      
        
        
        boolean delProviderExists = searchProvider(delProviderNum);
        
        
        
        if (delProviderExists) {
          System.out.println("Deleting Provider");
          deleteProvider(delProviderNum);
        } else {
          System.out.println("Provider not found");
        }
        break;
        
        
      default:
        System.out.println("Invalid option. Returning to operator menu.");
        break;
    }
  }
 
  /**
   * Adds member and prints confirmation.

   * @param name
   * 
   */
  public void addMember(String name) {
    Member addition = new Member(name, "1600 Penn. Ave.", "Tuscaloosa", "AL", "63049");
    memberRecordsArray.add(addition);
    System.out.println("Member successfully added");
    
  }
  
  /**
   * searches for member.

   * @param memberNumber
   * 
   * @return boolean
   */
  public boolean searchMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Changes member name.

   * @param memberNumber
   * 
   * @param newName
   * 
   */
  public void changeMemberName(int memberNumber, String newName) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.get(i).setMemberName(newName);
        System.out.print("New name: "); 
        memberRecordsArray.get(i).printMember();
      }
    }
  }
  
  /**
   * Suspends member.

   * @param memberNumber
   * 
   */
  public void suspendMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.get(i).setSuspendedStatus(true);
        System.out.println("Member suspended."); 
      }
    }
  }
  
  /**
   * Unsuspends member.

   * @param memberNumber
   * 
   */
  public void unSuspendMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.get(i).setSuspendedStatus(false);
        System.out.println("Member unsuspended."); 
      }
    }
  }
  
  /**
   * Checks if member is suspended.

   * @param memberNumber
   * 
   * @return boolean
   */
  public boolean checkSuspended(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        return memberRecordsArray.get(i).isSuspended();
      }
    }
    return false;
  }
  
  /**
   * Deletes member.

   * @param memberNumber
   * 
   */
  public void deleteMember(int memberNumber) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        memberRecordsArray.remove(i);
        System.out.println("Member successfully deleted");
      }
    }
  }
  
  /**
   * Prints member list.
   */
  public void printMemberList() {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      memberRecordsArray.get(i).printMember();
      System.out.println();
    }
  }
  
  /**
   * Gets member name.

   * @param memberNum
   * 
   * @return member name
   */
  public String getMemName(int memberNum) {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      if (memberRecordsArray.get(i).getMemberNumber() == memberNum) {
        return memberRecordsArray.get(i).getMemberName();
      }
    }
    return "Error Records controller line 298";
  }
  
  /**
   * Gets provider name.

   * @param provNum
   * 
   * @return Provider name
   */
  public String getProvName(int provNum) {
    for (int i = 0; i < providerRecordsArray.size(); i++) {
      if (providerRecordsArray.get(i).getProviderNumber() == provNum) {
        return providerRecordsArray.get(i).getProviderName();
      }
    }
    return "Error Records controller line 308";
  }
  
  /**
   * Adds Provider.

   * @param name
   * 
   */
  public void addProvider(String name) {
    Provider addition = new Provider(name, "1600 Penn. Ave.", "Tuscaloosa", "AL", "63049");
    providerRecordsArray.add(addition);
    System.out.println("Provider successfully added");
  }
 
  /**
   * Searches for provider.

   * @param providerNumber
   * 
   * @return boolean
   */
  public boolean searchProvider(int providerNumber) {
    for (int i = 0; i < providerRecordsArray.size(); i++) {
      if (providerRecordsArray.get(i).getProviderNumber() == providerNumber) {
        return true;
      }
    }
    return false;
  }

  /**
   * Deletes Provider.

   * @param providerNumber
   * 
   */
  public void deleteProvider(int providerNumber) {
    for (int i = 0; i < providerRecordsArray.size(); i++) {
      if (providerRecordsArray.get(i).getProviderNumber() == providerNumber) {
        providerRecordsArray.remove(i);
        System.out.println("Provider successfully deleted");
      }
    } 
  }
  
  /**
   * Changes provider name.

   * @param providerNumber
   * 
   * @param newName
   * 
   */
  public void changeProviderName(int providerNumber, String newName) {
    for (int i = 0; i < providerRecordsArray.size(); i++) {
      if (providerRecordsArray.get(i).getProviderNumber() == providerNumber) {
        providerRecordsArray.get(i).setProviderName(newName);
        System.out.print("New name: "); 
        providerRecordsArray.get(i).printProvider();
      }
    }
  }
}