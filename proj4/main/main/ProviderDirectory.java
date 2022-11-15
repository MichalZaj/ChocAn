package main.main;

public class ProviderDirectory {
  //member variables
  int[] serviceCode;
  String[] serviceDescriptions;
  
  public ProviderDirectory() {
    serviceCode = new int[10];
    serviceCode[0] = 1001;
    serviceCode[1] = 1002;
    serviceCode[2] = 1003;
    serviceCode[3] = 1004;
    serviceCode[4] = 1005;
    serviceCode[5] = 1006;
    serviceCode[6] = 1007;
    serviceCode[7] = 1008;
    serviceCode[8] = 1009;
    serviceCode[9] = 9999;
    
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
  
  public void printDirectory() {
    for (int i = 0; i < 10; i++) {
      System.out.print(serviceCode[i] + " - " + serviceDescriptions[i] + "\n");
    }
    System.out.println();
  }
  
}
