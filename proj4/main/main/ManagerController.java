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

  public ManagerController() {
    myReports = new Reports();
    myTimer = new Timer();
  }

  public void printEftReport() {
    myTimer.runMainAccountingProcedure();
    Reports.theEftReport.printReport();
  }
    
  public void printProviderReport() {

  }
    
  public void printMemberReport() {

  }
    
  public void printSummaryReport() {
    myTimer.runMainAccountingProcedure();
    Reports.theSummaryReport.print();
  }
}
