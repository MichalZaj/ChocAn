package main.main;

import java.util.Random;

/** Individual member. */
public class Member extends MemberRecords {
  private String memberName;
  private int[] memberNumber;
  private boolean suspendedMember;

  /** Constructor. */
  public Member() {
    Member member = new Member();
    member.memberName = null;
    member.memberNumber = new int[9];
    member.suspendedMember = false;
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

}
