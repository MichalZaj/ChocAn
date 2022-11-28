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
    System.out.println("Running main accounting procedure.");
    for (int i = 0; i < WeeklyServiceRecord.serviceRecordsArray.size(); i++) {
      int currNum = WeeklyServiceRecord.serviceRecordsArray.get(i).memberNumber;
      int reportIndex = theReports.doesMemReportExist(currNum);
      
      
      if (reportIndex == -1) {//if The report does not yet exist, add a new one to the end
        
      } else { //if it does exist, we are simply going to add a service
        
      }
    }
    
  }
}
