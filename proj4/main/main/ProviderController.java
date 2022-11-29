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
  
  /**
   * This method searches the provider directory with a provider number.
   */
  public void searchProviderDirectory(int num) {
    ProviderDirectory provDirectory = new ProviderDirectory();
    provDirectory.searchDirectory(num);
  }
  
  /**
   * This method adds a service to the service record.
   */
  public void addEntry(String srvDte, Integer prvNum, Integer memNum, Integer srvCde, String coms) {
    serviceRecord.addArray(srvDte, prvNum, memNum, srvCde, coms);
  }
  
  /**
   * This method prints the service record.
   */
  public void printRecords() {
    serviceRecord.print();
  }
  
  /**
   * This method checks to see if a service exists.
   */
  public boolean doesServiceExist(int servCode) {
    ProviderDirectory provDirectory = new ProviderDirectory();
    return provDirectory.findService(servCode);
  }
  
  
  
}
