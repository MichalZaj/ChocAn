package main.main;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the provider report class.

 * @author cjmes
 *
 */
public class ProviderReport {
  public Provider theProvider;
  public List<Service> serviceArray;
  public RecordsController myController = new RecordsController();
  
  /**
   * This function will create a new provider report based on the given member.

   * @param providerNumber desired member to be accessed in report class
   */
  public ProviderReport(int providerNumber) {
    for (int i = 0; i < RecordsController.providerRecordsArray.size(); i++) {
      if (RecordsController.providerRecordsArray.get(i).getProviderNumber() == providerNumber) {
        String name = RecordsController.providerRecordsArray.get(i).getProviderName();
        String address = RecordsController.providerRecordsArray.get(i).streetAddress;
        String city = RecordsController.providerRecordsArray.get(i).city;
        String state = RecordsController.providerRecordsArray.get(i).state;
        String zip = RecordsController.providerRecordsArray.get(i).zip;
        
        theProvider = new Provider(name, address, city, state, zip);
        theProvider.providerNumber = providerNumber;
        
        
      }
    }
    serviceArray = new ArrayList<Service>();
  }
  /**
   * This function adds a service report to the report.

   * @param serviceReport is the desired service to be added.

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
   * This function prints the provider report.
   */
  public void print() {
    System.out.println("===Provider Report===");
    theProvider.printProvider();
    double runningFee = 0;
    System.out.println("----Services Rendered----\n");
    for (int i = 0; i < serviceArray.size(); i++) {
      System.out.println("Service NO." + (i + 1));
      serviceArray.get(i).printServiceForProvider();
      System.out.println("-------------------------\n");
      runningFee += serviceArray.get(i).fee;
    }
    System.out.println("Summary information");
    System.out.println("Total number of consultations: " + serviceArray.size());
    System.out.println("Total fee to be collected    : $" + runningFee);
    
  }
  
  /**
   * This function gets the fee from the provider report. Only used by the summary report class.

   * @return the overall fee
   */
  
  public double getFee() {
    double runningFee = 0;
    for (int i = 0; i < serviceArray.size(); i++) {
      runningFee += serviceArray.get(i).fee;
    }
    return runningFee;
  }
}
