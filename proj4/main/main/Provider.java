package main.main;

import java.util.Random;

/** Individual Provider. */
public class Provider {
  private String providerName;
  private int providerNumber;

  /** Constructor. */
  
  public Provider(String name) {
    providerName = name;
    Random rand = new Random();
    for (int i = 0; i < 9; i++) {
      providerNumber = rand.nextInt(899999999) + 100000000;
    }
    
    
  }
  
  //Getters
  
  public void printProvider() {
    System.out.println("Name: " + providerName + "\nProvider Number: " + providerNumber);
  }
  
  /** Gets Provider number. */
  public int getProviderNumber() {
    return providerNumber;
  }
  
  public String getProviderName() {
    return providerName;
  }
  
  //Setters
  
  public void setProviderNumber(int desiredNum) {
    providerNumber = desiredNum;
  }
  
  public void setProviderName(String name) {
    providerName = name;
  }

}
