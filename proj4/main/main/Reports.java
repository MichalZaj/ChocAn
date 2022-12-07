package main.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Reports includes all of the different report types. 
 */
public class Reports {
  static List<MemberReport> memberReportsArray = new ArrayList<MemberReport>();
  static List<ProviderReport> providerReportsArray = new ArrayList<ProviderReport>();
  static EftReport theEftReport = new EftReport();
  static SummaryReport theSummaryReport = new SummaryReport();
  
  
  public Reports() {

  }
  
  /**
   * This function returns the index in the array of the desired member's report.

   * @param memberNum is the members number we are looking for. 

   * @return the index of the report. If doesn't exist, we are going to have to create a new report.
   */
  public int doesMemReportExist(int memberNum) {
    for (int i = 0; i < memberReportsArray.size(); i++) {
      if (memberReportsArray.get(i).theMember.getMemberNumber() == memberNum) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * This function creates a new member report.

   * @param memberNum is the member the report is being sent to. 
   */
  public void createNewMemberReport(int memberNum) {
    MemberReport addition = new MemberReport(memberNum);
    memberReportsArray.add(addition);
  }
  
  /**
   * This function adds a new service to the member report.

   * @param serviceReport is the service that will be added. 
   */
  public void addMemberService(Service serviceReport, int indexOfMemReport) {
    memberReportsArray.get(indexOfMemReport).addService(serviceReport);
  }
  
  /**
   * This function prints a member report.

   * @param memNum this is the member num.

   * @return a boolean value, true if successfully printed, false if not.
   */
  public boolean printMemReport(int memNum) {
    for (int i = 0; i < memberReportsArray.size(); i++) {
      if (memberReportsArray.get(i).theMember.getMemberNumber() == memNum) {
        memberReportsArray.get(i).print();
        return true;
      }
    }
    return false;
  }
  
  /**
   * This function determines if a provider report exists.

   * @param provNum this is the desired provider number.

   * @return the index of the provider num in the array, or -1 if it does not exist.
   */
  
  public int doesProvReportExist(int provNum) {
    for (int i = 0; i < providerReportsArray.size(); i++) {
      if (providerReportsArray.get(i).theProvider.getProviderNumber() == provNum) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * This function prints the provider report.

   * @param provNum the desired provider number.

   * @return true if successful, false if not.
   */
  public boolean printProvReport(int provNum) {
    for (int i = 0; i < providerReportsArray.size(); i++) {
      if (providerReportsArray.get(i).theProvider.getProviderNumber() == provNum) {
        providerReportsArray.get(i).print();
        return true;
      }
    }
    return false;
  }
  
  public void createNewProviderReport(int provNum) {
    ProviderReport addition = new ProviderReport(provNum);
    providerReportsArray.add(addition);
  }
  
  public void addProviderService(Service serviceReport, int indexOfProvReport) {
    providerReportsArray.get(indexOfProvReport).addService(serviceReport);
  }
  
  
  /**
   * This function clears all report for a new main accounting procedure. 
   */
  public void clearReports() {
    memberReportsArray.clear();
    providerReportsArray.clear();
    theEftReport.clear();
    theSummaryReport.clear();
    
  }
  
  /**
   * Prints all provider reports.
   */
  public void printAllProviderReports() {
    for (int i = 0; i < providerReportsArray.size(); i++) {
      providerReportsArray.get(i).print();
    }
  }
  
  /**
   * Prints all member reports.
   */
  public void printAllMemberReports() {
    for (int i = 0; i < memberReportsArray.size(); i++) {
      memberReportsArray.get(i).print();
    }
  }
  
  /**
   * Prints all reports.
   */
  public void printAllReports() {
    System.out.println("====MEMBER REPORTS====");
    printAllMemberReports();
    System.out.println("\n\n\n");
    System.out.println("====PROVIDER REPORTS====");
    printAllProviderReports();
    System.out.println("\n\n\n");
    System.out.println("====EFT REPORTS====");
    theEftReport.printReport();
    System.out.println("\n\n\n");
    System.out.println("====SUMMARY REPORTS====");
    theSummaryReport.print();
    System.out.println("\n\n\n");
    
  }
}


