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
  
  String providerName;
  String nameOfService;
  double fee;
  
  String memberName;
  
  
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
    
    RecordsController myRecords = new RecordsController();
    providerName = myRecords.getProvName(prvNum);
    
    ProviderDirectory myDirectory = new ProviderDirectory();
    nameOfService = myDirectory.getServiceName(serviceCode);
    
    fee = myDirectory.getServicePrice(serviceCode);
    
    memberName = myRecords.getMemName(memberNumber);
    
    
  }
  
  public Service(String svDte, String rec, Integer prNm, Integer meNm, Integer srvCde, String cms) {
    dateOfService = (svDte);

    
    dateOfRecording = rec;

    providerNumber = prNm;
    
    memberNumber = meNm;
    
    serviceCode = srvCde;
    
    comments = cms;
    
    RecordsController myRecords = new RecordsController();
    providerName = myRecords.getProvName(prNm);
    
    ProviderDirectory myDirectory = new ProviderDirectory();
    nameOfService = myDirectory.getServiceName(serviceCode);
    
    fee = myDirectory.getServicePrice(serviceCode);
    
    memberName = myRecords.getMemName(memberNumber);
  }
  
  
  
  public void printService() {
    System.out.println("Date of Service  : " + dateOfService);
    System.out.println("Date of Recording: " + dateOfRecording);
    System.out.println("Provider Number  : " + providerNumber);
    System.out.println("Member Number    : " + memberNumber);
    System.out.println("Service Code     : " + serviceCode);
    System.out.println("Comments: " + comments);
  }
  
  public void printServiceForMemReport() {
    System.out.println("Date of Service  : " + dateOfService);
    System.out.println("Provider Name    : " + providerName);
    System.out.println("Service  Name    : " + nameOfService);
    
  }
  
  public void printServiceForProvider() {
    System.out.println("Date of Service  : " + dateOfService);
    System.out.println("Date of Recording: " + dateOfRecording);
    System.out.println("Member name      : " + memberName);
    System.out.println("Member Number    : " + memberNumber);
    System.out.println("Service Code     : " + serviceCode);
    System.out.println("Fee              : $" + fee);
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