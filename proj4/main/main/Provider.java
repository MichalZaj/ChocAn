package main.main;

import java.util.Random;

/** Individual Provider. */
public class Provider {
  private String providerName;
  public int providerNumber;
  
  public String streetAddress;
  public String city;
  public String state;
  public String zip;

  /** Constructor. */
  
  public Provider(String name, String address, String acity, String astate, String azip) {
    providerName = name;
    Random rand = new Random();
    for (int i = 0; i < 9; i++) {
      providerNumber = rand.nextInt(899999999) + 100000000;
    }
    streetAddress = address;
    city = acity;
    state = astate;
    zip = azip;
    
  }
  
  /**
   * prints provider.
   */
  
  public void printProvider() {
    System.out.println("Name: " + providerName + "\nProvider Number: " + providerNumber);
    System.out.println(streetAddress + "\n" + city + ", " + state + " " + zip);
    
  }
  
  /** Gets Provider number. */
  public int getProviderNumber() {
    return providerNumber;
  }
  
  /** Gets Provider name. */
  public String getProviderName() {
    return providerName;
  }
  
  //Setters
  
  /** Sets Provider number. */
  public void setProviderNumber(int desiredNum) {
    providerNumber = desiredNum;
  }
  
  /** Sets Provider name. */
  public void setProviderName(String name) {
    providerName = name;
  }

}
