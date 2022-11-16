package main.main;

/** Class provides access to actions for all record types.

 * @author Cristina Paier */
public class Records {
  Member member = null;
  Provider provider = null;
  String user;
  
  public Records() {
    Records records = new Records()
  }
  
  /** Accesses records to identify type of user. 
 * @throws Exception */
  public String accessRecords(int[] number) throws Exception {
    member = MemberRecords.getMember(number);
    provider = ProviderRecords.getProvider(number);
    if (member != null) {
      user = "member";
    }
    else if (provider != null) {
      user = "provider";
    }
    else {
    	throw new Exception("Invalid");
    }
    return user;
  }
  
  /** Method to delete member record. */
  public void deleteRecord(int[] number) {
    try {
		user = accessRecords(number);
	} catch (Exception e) {
		e.printStackTrace();
	}
    if (user == "member") {
      MemberRecords.deleteMember(member);
    }
    else if (provider != null) {
      user = "provider";
      }
    MemberRecords.deleteMember(member);
  }
  
  /** Method to edit member record. */
  public void editRecord(int[] number) {
    try {
      member = MemberRecords.getMember(number);
    } catch (Exception e) {
      e.printStackTrace();
    }
    MemberRecords.editRecord(member);
  }
  
  public void addRecord(Member member) {
    MemberRecords.addMember(member);
  }

  public static void main(String[] args) {
    
  }

}
