package main.main;

import java.util.Random;

/** Individual member. */
public class aMember {
  private String memberName;
  private int memberNumber;
  private boolean suspendedMember;

  /** Constructor. */
  
  public aMember(String name) {
    memberName = name;
    suspendedMember = false;
    Random rand = new Random();
    for (int i = 0; i < 9; i++) {
      memberNumber = rand.nextInt(899999999) + 100000000;
    }
    
    
  }
  
  //Getters
  public void printMember() {
    System.out.println("Name: " + memberName + "\nMember Number: " + memberNumber);
  }
  
  /** Gets member number. */
  public int getMemberNumber() {
    return memberNumber;
  }
  
  public String getMemberName() {
    return memberName;
  }
  
  public boolean isSuspended(boolean status) {
    return suspendedMember;
  }
  
  //Setters
  public void suspendMember(boolean desiredState) {
    suspendedMember = desiredState;
  }
  
  public void setMemberNumber(int desiredNum) {
    memberNumber = desiredNum;
  }
  
  public void setMemberName(String name) {
    memberName = name;
  }

}
