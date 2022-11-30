package main.main;


import java.util.ArrayList;
import java.util.List;

/**
 * Contains the weekly service records array.

 * @author cjmes
 *
 */
public class WeeklyServiceRecord {
  
  static List<Service> serviceRecordsArray = new ArrayList<Service>();
  
  WeeklyServiceRecord() {
    
  }
  
  /**
   * Adds a service to an array.

   * @param srvDte the service date, string
   * @param prvNum the provider num, int
   * @param memNum the member num, int
   * @param srvCde the service code, int
   * @param coms the comments, String
   */
  public void addArray(String srvDte, Integer prvNum, Integer memNum, Integer srvCde, String coms) {
    Service addition = new Service(srvDte, prvNum, memNum, srvCde, coms);
    serviceRecordsArray.add(addition);
    System.out.println("Successfully added!");
    
  }
  
  /**
   * Prints the entire service array.
   */
  public void print() {
    for (int i = 0; i < serviceRecordsArray.size(); i++) {
      serviceRecordsArray.get(i).printService();
    }
  }
  
  
  
  
  
  
}
