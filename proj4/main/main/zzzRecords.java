package main.main;

/** Class provides access to actions for all record types.

 * @author Cristina Paier */
public class zzzRecords {
  String user;
  
  public zzzRecords() {
    zzzRecords records = new zzzRecords();
  }
  
  /** Accesses records to identify type of user. 

  * @throws Exception 
  When user isn't found. */
  public String accessRecords(int[] number) throws Exception {
    zzzMemberRecords.memberRecordsArray = zzzMemberRecords.getMemberRecords();
    Member member = new Member();
    member = zzzMemberRecords.getMember(number);
    zzzProviderRecords.providerRecordsArray = zzzProviderRecords.getProviderRecords();
    Provider provider = new Provider();
    provider = zzzProviderRecords.getProvider(number);
    if (member != null) {
      user = "member";
    } else if (provider != null) {
      user = "provider";
    } else {
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
      Member member = new Member();
      member = zzzMemberRecords.getMember(number);
      zzzMemberRecords.deleteMember(member);
    } else if (user == "provider") {
      Provider provider = new Provider();
      provider = zzzProviderRecords.getProvider(number);
      zzzProviderRecords.deleteProvider(provider);
    }
  }
  
  /** Method to edit member record. */
  public void editRecord(int[] number) {
    try {
      user = accessRecords(number);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (user == "member") {
      Member member = new Member();
      member = zzzMemberRecords.getMember(number);
      zzzMemberRecords.editRecord(member);
    }
  }
  
  /** Adds a record. */
  public void addRecord(int[] number) {
    try {
      user = accessRecords(number);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (user == "member") {
      Member member = new Member();
      member = zzzMemberRecords.getMember(number);
      zzzMemberRecords memberRecords = new zzzMemberRecords();
      memberRecords.addMember(member);
    } else if (user == "provider") {
      Provider provider = new Provider();
      provider = zzzProviderRecords.getProvider(number);
      zzzProviderRecords providerRecords = new zzzProviderRecords();
      providerRecords.addProvider(provider);
    }
  }

}
