package main.main;

public class Service {
  //member variables
  Date dateOfService;
  Date dateOfRecording;
  int providerNumber;
  int memberNumber;
  int serviceCode;
  string comments;
  
  public void setServiceDate(int m, int d, int y) { 
    dateOfService.setDate(m, d, y);
      }
      
  public Date getServiceDate() {
     return dateOfService;
     }
      
  public void setRecordingDate(int m, int d, int y) {
      dateOfRecording.setDate(m, d, y);
      } 
      
    public Date getRecordingDate() {
     return dateOfRecording;
     }
     
   public void setProviderNumber(int n) {
        providerNumber = n;
    }
    
    public int getProviderNumber() {
        return provierNumber;
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
    
    public void setComments(string c) { 
        comments = c;
    }
       public string getComments() { //im not sure this would really be used but I added it there cause why not
    return comments;
  }
    
