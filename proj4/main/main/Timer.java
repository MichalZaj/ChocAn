package main.main;


/**
 * This class will create reports.

 * @author cjmes
 *
 */

public class Timer {

  WeeklyServiceRecord weeklyRecords = new WeeklyServiceRecord();
  RecordsController myRecords = new RecordsController();
  Reports theReports = new Reports();
  
  public Timer() {

  }
  
  /**
   * Runs the main accounting procedure.
   * 
   */
  public void runMainAccountingProcedure() {

    
  
    
    theReports.clearReports();
    //--MEMBER REPORTS----------------------------------------------------------------
    for (int i = 0; i < WeeklyServiceRecord.serviceRecordsArray.size(); i++) {
      int currNum = WeeklyServiceRecord.serviceRecordsArray.get(i).memberNumber;
      //We have identified a service to be recorded
      
      boolean memExists = myRecords.searchMember(currNum);
      if (!memExists) {
        //The member has a service record, but the member has been deleted. 
        //WIll not be added to report
        continue;
      }
      
      
      int reportIndex = theReports.doesMemReportExist(currNum);
      
      if (reportIndex == -1) {
        //if The report does not yet exist, add a new one 
        theReports.createNewMemberReport(currNum);
        reportIndex = theReports.doesMemReportExist(currNum);
      }
      theReports.addMemberService(WeeklyServiceRecord.serviceRecordsArray.get(i), reportIndex);
  
    }
    
    
    //--PROVIDER REPORTS----------------------------------------------------------------
    for (int i = 0; i < WeeklyServiceRecord.serviceRecordsArray.size(); i++) {
      int currNum = WeeklyServiceRecord.serviceRecordsArray.get(i).providerNumber;
      //We have identified a service to be recorded
        
      
      boolean provExists = myRecords.searchProvider(currNum);
      if (!provExists) {
        //The provider has a service record, but the provider has been deleted. 
        //WIll not be added to report
        continue;
      }
      
      int reportIndex = theReports.doesProvReportExist(currNum);
        
      if (reportIndex == -1) {
        //if The report does not yet exist, add a new one 
        theReports.createNewProviderReport(currNum);
        reportIndex = theReports.doesProvReportExist(currNum);
      }
      theReports.addProviderService(WeeklyServiceRecord.serviceRecordsArray.get(i), reportIndex);
    
    }
    
    //--EFT REPORT----------------------------------------------------------------------
    Reports.theEftReport.populateReport();
    
    //--SUMMARY REPORT------------------------------------------------------------------
    Reports.theSummaryReport.populateReport();
    
    
    
  }
}
