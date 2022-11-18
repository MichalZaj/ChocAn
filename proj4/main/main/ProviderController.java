package main.main;

/**
 * This class is intended to manage requests from the provider menu to entities.

 * @author cjmes
 *
 */

public class ProviderController {

  WeeklyServiceRecord serviceRecord = new WeeklyServiceRecord();
 
  public ProviderController() {
    
  }
  
  /**
   * This method prints the provider directory.
   */
  
  public void printProviderDirectory() {
    ProviderDirectory provDirectory = new ProviderDirectory();
    provDirectory.printDirectory();
    
  }
  
  public void searchProviderDirectory(int num) {
    ProviderDirectory provDirectory = new ProviderDirectory();
    provDirectory.searchDirectory(num);
  }
  
  public void addEntry(String srvDte, Integer prvNum, Integer memNum, Integer srvCde, String coms) {
    serviceRecord.addArray(srvDte, prvNum, memNum, srvCde, coms);
  }
  
  public void printRecords() {
    serviceRecord.print();
  }
  
  
  
}
