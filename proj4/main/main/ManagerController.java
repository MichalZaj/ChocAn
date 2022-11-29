package main.main;

/**
 * Manager Controller creates and prints the manager's (and timer's) reports. 
 *
 * @author Thomas Roden
 *
 */

public class ManagerController {

  Reports myReports;
  Timer myTimer;
  RecordsController myRecords;
  
  /**
   * This is the default manager controller constructor.
   */
  public ManagerController() {
    myReports = new Reports();
    myTimer = new Timer();
    myRecords = new RecordsController();
  }

  /**
   * Prints EFT Report.
   */
  public void printEftReport() {
    myTimer.runMainAccountingProcedure();
    Reports.theEftReport.printReport();
  }
  
  /**
   *Prints Member Report.
   */
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

  /**
   * Prints Provider Report.
   */
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
  
  /**
   * Prints summary report.
   */
  public void printSummaryReport() {
    myTimer.runMainAccountingProcedure();
    Reports.theSummaryReport.print();
  }
}
