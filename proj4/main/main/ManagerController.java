package main.main;

/**
 * Manager Controller creates and prints the manager's (and timer's) reports. 
 *
 * @author thomas Roden
 *
 */

public class ManagerController {

  Reports myReports;
  Timer myTimer;
  RecordsController myRecords;
  

  public ManagerController() {
    myReports = new Reports();
    myTimer = new Timer();
    myRecords = new RecordsController();
  }

  public void printEftReport() {
    myTimer.runMainAccountingProcedure();
    Reports.theEftReport.printReport();
  }
    
  public void printProviderReport() {

  }
    
  public boolean printMemberReport(int memNum) {
    myTimer.runMainAccountingProcedure();
    boolean memExists = myRecords.searchMember(memNum);
    if (memExists) {
      boolean returnVal = myReports.printMemReport(memNum);
      return returnVal;
    } else {
      return false;
    }
  }

  public boolean printProviderReport(int provNum) {
    myTimer.runMainAccountingProcedure();
    boolean provExists = myRecords.searchProvider(provNum);
    if (provExists) {
      boolean returnVal = myReports.printProvReport(provNum);
      return returnVal;
    } else {
      return false;
    }
  }
  
  public void printSummaryReport() {
    myTimer.runMainAccountingProcedure();
    Reports.theSummaryReport.print();
  }
}
