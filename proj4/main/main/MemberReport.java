package main.main;

import java.util.ArrayList;
import java.util.List;
/**
 * This is the member report class.

 * @author cjmes
 *
 */
public class MemberReport {
  public Member theMember;
  public List<Service> serviceArray;
  public RecordsController myController = new RecordsController();
  
  /**
   * This function will create a new member report based on the given member.

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
    serviceArray = new ArrayList<Service>();
  }
  
  /**
   * This function will create a new service available to members.

   * @param serviceReport report that the new service information will be added to
   */
  public void addService(Service serviceReport) {
    String srvDate = serviceReport.dateOfService;
    String dayOfRecord = serviceReport.dateOfRecording;
    int provNum = serviceReport.providerNumber;
    int memNum = serviceReport.memberNumber;
    int servCode = serviceReport.serviceCode;
    String comms = serviceReport.comments;
  

    Service addition = new Service(srvDate, dayOfRecord, provNum, memNum, servCode, comms);
    
    serviceArray.add(addition);
  }
  
  /**
   * This function will print the current member report.
   */
  public void print() {
    System.out.println("===Member Report===");
    theMember.printMember();
    System.out.println("----Services Rendered----\n");
    for (int i = 0; i < serviceArray.size(); i++) {
      System.out.println("Service NO." + (i + 1));
      serviceArray.get(i).printServiceForMemReport();
      System.out.println("-------------------------\n");
    }
  }
  
}
