package main.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Service {
  //member variables
  String dateOfService;
  String dateOfRecording;
  int providerNumber;
  int memberNumber;
  int serviceCode;
  String comments;
  
  public Service(String srvDte, Integer prvNum, Integer memNum, Integer srvCde, String coms) {
    dateOfService = (srvDte);

    Date d = Calendar.getInstance().getTime();  
    DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
    String stDate = df.format(d);  
    dateOfRecording = stDate;

    providerNumber = prvNum;
    
    memberNumber = memNum;
    
    serviceCode = srvCde;
    
    comments = coms;
  }
  
  public void printService() {
    System.out.println("Date of Service  : " + dateOfService);
    System.out.println("Date of Recording: " + dateOfRecording);
    System.out.println("Provider Number  : " + providerNumber);
    System.out.println("Member Number    : " + memberNumber);
    System.out.println("Service Code     : " + serviceCode);
    System.out.println("Comments: " + comments);
  }
     
  public void setProviderNumber(int n) {
    providerNumber = n;
  }
    
  public int getProviderNumber() {
    return providerNumber;
  }
    
  public void setMemberNumber(int n) {
    memberNumber = n;
  }
  
  public int getMemberNumber() {
    return memberNumber;
  }
  
  public void setServiceCode(int n) {
    serviceCode = n;
  }  

  public int getServiceCode() {
    return serviceCode;
  }
    
  public void setComments(String c) { 
    comments = c;
  }

  public String getComments() { 
    return comments;
  }
}