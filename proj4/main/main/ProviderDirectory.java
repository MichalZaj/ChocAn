package main.main;

/**
 * Provider directory constructor. 

 * @author cjmes
 *
 */

public class ProviderDirectory {
  //member variables
  int[] serviceCode;
  String[] serviceDescriptions;
  
  /**
   * Constructor for provider directory.
   */
  
  public ProviderDirectory() {
    serviceCode = new int[10];
    serviceCode[0] = 100001;
    serviceCode[1] = 100002;
    serviceCode[2] = 100003;
    serviceCode[3] = 100004;
    serviceCode[4] = 100005;
    serviceCode[5] = 100006;
    serviceCode[6] = 100007;
    serviceCode[7] = 100008;
    serviceCode[8] = 100009;
    serviceCode[9] = 999999;
    
    serviceDescriptions = new String[10];
    serviceDescriptions[0] = "Chocolate Removal";
    serviceDescriptions[1] = "Chocolate Energization";
    serviceDescriptions[2] = "Emergency Chocolate Infusion";
    serviceDescriptions[3] = "Massage";
    serviceDescriptions[4] = "Chocolate Massage";
    serviceDescriptions[5] = "Longterm Rehabilitation";
    serviceDescriptions[6] = "Chocolate Demolition";
    serviceDescriptions[7] = "Shortterm Care";
    serviceDescriptions[8] = "Chocolate Droppings";
    serviceDescriptions[9] = "Miscellaneous Care";
    
  }
  
  /**
   * Prints the provider directory.
   */
  
  public void printDirectory() {
    for (int i = 0; i < 10; i++) {
      System.out.print(serviceCode[i] + " - " + serviceDescriptions[i] + "\n");
    }
    System.out.println();
  }
  
  /**
   * Searches the directory and prints out an entry if it is found.

   * @param num
    Given provider directory code
   */
  
  public void searchDirectory(int num) {
    for (int i = 0; i < 10; i++) {
      if (num == serviceCode[i]) {
        System.out.println("Service Found : " + serviceDescriptions[i]);
        return;
      }
    }
    return;
  }
  
  
  
}
