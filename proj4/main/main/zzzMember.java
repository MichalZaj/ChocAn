package main.main;

import java.util.Random;



/** Individual member. */
public class zzzMember extends MemberRecords {
  private String memberName;
  private int[] memberNumber;
  private boolean suspendedMember;

  /** Constructor. */
  public zzzMember() {
    Member member = new Member();
    member.memberName = null;
    member.memberNumber = new int[9];
    member.suspendedMember = false;
  }
  
  public zzzMember(String name) {
    memberName = name;
    memberNumber = new int[9];
    suspendedMember = false;
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      newMember.memberNumber[i] = rand.nextInt(9);
    }
    
    System.out.println("New member\n"+memberName+"-"+memberNumber);
  }
  
  /** Gets member name. */
  public int[] getMemberNumber() {
    return member.memberNumber;
  }
  
  /** Adds member. */
  public void addMember(Member memberToAdd) {
    Member newMember = new Member();
    newMember.memberName = memberToAdd.memberName;
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      newMember.memberNumber[i] = rand.nextInt(9);
    }
  }
  
  public void suspendMember(Member member) {
    member.suspendedMember = true;
  }
  
  public void printMember() {
	System.out.println("Name: " + memberName+"\nMember Number: " + memberNumber);
  }

}

*/