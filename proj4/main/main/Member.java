package main.main;

import java.util.Random;

/**
 * This class provides a template for Members.

 * @author cpaier
 *
 */
public class Member {
  private String memberName;
  public int memberNumber;
  private boolean suspendedMember;
  
  public String streetAddress;
  public String city;
  public String state;
  public String zip;

  /** Constructor. */
  
  public Member(String name, String address, String acity, String astate, String azip) {
    memberName = name;
    suspendedMember = false;
    Random rand = new Random();
    for (int i = 0; i < 9; i++) {
      memberNumber = rand.nextInt(899999999) + 100000000;
    }
    
    streetAddress = address;
    city = acity;
    state = astate;
    zip = azip;
    
  }
  
  //Getters
  
  /**
   * Prints member info.
   */
  
  public void printMember() {
    System.out.println("Name: " + memberName + "\nMember Number: " + memberNumber);
    System.out.print("Status: ");
    if (suspendedMember) {
      System.out.println("Suspended");
    } else {
      System.out.println("NOT suspended");
    }
    System.out.println(streetAddress + "\n" + city + ", " + state + " " + zip);
  }
  
  /** 
   * This function returns the member number.

   * @return Returns the member number
   */
  public int getMemberNumber() {
    return memberNumber;
  }
  
  /**
   * This function returns the member name.

   * @return returns the member name
   */
  public String getMemberName() {
    return memberName;
  }
  
  
  /**
   * This function returns true if the member is suspended, false if not.

   * @return true for suspended, false for unsuspended
   */
  public boolean isSuspended() {
    return suspendedMember;
  }
  
  /**
   * This function suspends a member by setting their suspended status to true.

   * @param desiredState reflects what the desired state is.
   */
  public void setSuspendedStatus(boolean desiredState) {
    suspendedMember = desiredState;
  }
  
  /**
   * This function sets member number to desired Num.

   * @param desiredNum is the desired number. 
   */
  public void setMemberNumber(int desiredNum) {
    memberNumber = desiredNum;
  }
  
  /**
   * This function sets member name to name.

   * @param name the name the members name will be set to.
   */
  public void setMemberName(String name) {
    memberName = name;
  }

}
