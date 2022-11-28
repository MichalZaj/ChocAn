package main.main;

import java.util.ArrayList;
import java.util.List;

public class MemberReport {
  public Member theMember;
  public List<Service> serviceArray = new ArrayList<Service>();
  public RecordsController myController = new RecordsController();
  
  /**
   * This function will create a new member report based on the given member 

   * @param memberNumber desired member to be accessed in report class
   */
  public MemberReport(int memberNumber) {
    for (int i = 0; i < RecordsController.memberRecordsArray.size(); i++) {
      if (RecordsController.memberRecordsArray.get(i).getMemberNumber() == memberNumber) {
        String name = RecordsController.memberRecordsArray.get(i).getMemberName();
        String address = RecordsController.memberRecordsArray.get(i).streetAddress;
        String city = RecordsController.memberRecordsArray.get(i).city;
        String state = RecordsController.memberRecordsArray.get(i).state;
        String zip = RecordsController.memberRecordsArray.get(i).zip;
        
        theMember = new Member(name, address, city, state, zip);
        theMember.memberNumber = memberNumber;
        
        
      }
    }
  }
  
  public void addService() {
    
  }
  
  public void print() {

  }
  
}
