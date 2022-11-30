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
  double[] prices;
  
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
    
    prices = new double[10];
    prices[0] = 10.10;
    prices[1] = 512.50;
    prices[2] = 120.20;
    prices[3] = 15.62;
    prices[4] = 90.21;
    prices[5] = 777.77;
    prices[6] = 42.24;
    prices[7] = 50.00;
    prices[8] = 75.00;
    prices[9] = 100.00;
    
  }
  
  /**
   * Prints the provider directory.
   */
  public void printDirectory() {
    for (int i = 0; i < 10; i++) {
      System.out.print(serviceCode[i] + " - " + serviceDescriptions[i] + "[$" + prices[i] + "]\n");
    }
    System.out.println();
  }
  
  /**
   * Searches the directory and prints out an entry if it is found.

   * @param num
    Given provider directory code
   */
  public void searchDirectory(int num) {
    boolean found = false;
    for (int i = 0; i < 10; i++) {
      if (num == serviceCode[i]) {
        System.out.println("Service Found : " + serviceDescriptions[i] + " - $" + prices[i]);
        found = true;
      }
    }
    if (found != true) {
      System.out.println("Service not found.");
    }
    System.out.println();
  }
  
  /**
   * Gets Service name given service code.

   * @param num
   * 
   * @return serviceDescriptions
   */
  public String getServiceName(int num) {
    for (int i = 0; i < 10; i++) {
      if (num == serviceCode[i]) {
        return serviceDescriptions[i];
      }
    }
    return "Error state - Prov Directory line 95";
  }
  
  /**
   * Gets service price given the service code.

   * @param num
   * 
   * @return prices
   */
  public double getServicePrice(int num) {
    for (int i = 0; i < 10; i++) {
      if (num == serviceCode[i]) {
        return prices[i];
      }
    }
    return 0.00;
  }
  
  /**
   * Finds if service exists given code.

   * @param num
   * 
   * @return boolean
   */
  public boolean findService(int num) {
    boolean found = false;
    for (int i = 0; i < 10; i++) {
      if (num == serviceCode[i]) {
        found = true;
        
      }
    }
    return found;
  }
}
