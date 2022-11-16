package main.main;

import java.util.ArrayList;
import java.util.List;

/** Record information for members. 

 * @author Cristina Paier */

public class MemberRecords extends Records {
  static List<Member> memberRecordsArray;
  static boolean validMember;
  static Member member;
  Member newMember;
  
  /** Constructor. */
  public MemberRecords() {
    List<Member> memberRecordsArray = new ArrayList<>();
    validMember = false;
  }
  
  /** Finds member. */
  public static Member getMember(int[] number) {
    int[] memberNumber;
    int index = 0;
    while (index < memberRecordsArray.size()) {
      memberNumber = memberRecordsArray.get(index).getMemberNumber();
      if (memberNumber == number) {
        member = memberRecordsArray.get(index);
        validMember = true;
      }
    }
    return member;
  }
  
  /** Suspends member. */
  public static void editRecord(Member member) {
    member.suspendMember(member);
  }

  /** Deletes member. */
  public static void deleteMember(Member member) {
    memberRecordsArray.remove(member);
  }
  
  /** Adds member. */
  public void addMember(Member memberToAdd) {
    Member newMember = new Member();
    newMember.addMember(memberToAdd);
    memberRecordsArray.add(newMember);
  }
  
  public static void main(String[] args) {
    
  }

  

}