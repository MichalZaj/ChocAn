package main.main;

/** Class provides access to actions for all record types.

 * @author Cristina Paier */
public class Records {
  String user;
  
  public Records() {
    Records records = new Records();
  }
  
  /** Accesses records to identify type of user. 

  * @throws Exception 
  When user isn't found. */
  public String accessRecords(int[] number) throws Exception {
    MemberRecords.memberRecordsArray = MemberRecords.getMemberRecords();
    Member member = new Member();
    member = MemberRecords.getMember(number);
    ProviderRecords.providerRecordsArray = ProviderRecords.getProviderRecords();
    Provider provider = new Provider();
    provider = ProviderRecords.getProvider(number);
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
      member = MemberRecords.getMember(number);
      MemberRecords.deleteMember(member);
    } else if (user == "provider") {
      Provider provider = new Provider();
      provider = ProviderRecords.getProvider(number);
      ProviderRecords.deleteProvider(provider);
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
      member = MemberRecords.getMember(number);
      MemberRecords.editRecord(member);
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
      member = MemberRecords.getMember(number);
      MemberRecords memberRecords = new MemberRecords();
      memberRecords.addMember(member);
    } else if (user == "provider") {
      Provider provider = new Provider();
      provider = ProviderRecords.getProvider(number);
      ProviderRecords providerRecords = new ProviderRecords();
      providerRecords.addProvider(provider);
    }
  }

}
