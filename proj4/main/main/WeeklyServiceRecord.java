package main.main;

 
import java.util.ArrayList;

import java.util.List;


public class WeeklyServiceRecord {
  
  static List<Service> serviceRecordsArray = new ArrayList<Service>();
  
  WeeklyServiceRecord() {
    
  }
  
  public void addArray(String srvDte, Integer prvNum, Integer memNum, Integer srvCde, String coms) {
    Service addition = new Service(srvDte, prvNum, memNum, srvCde, coms);
    serviceRecordsArray.add(addition);
    System.out.println("Successfully added!");
    
  }
  
  public void print() {
    for (int i = 0; i < serviceRecordsArray.size(); i++) {
      serviceRecordsArray.get(i).printService();
    }
  }
  
  
  
  
  
  
}
