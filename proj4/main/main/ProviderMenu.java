package main.main;

import java.util.Scanner;

public class ProviderMenu {
  
  public ProviderMenu() {

  }
  
  public void prompt() {
    Scanner myScanner = new Scanner(System.in);
    while (true) {
      System.out.println("Provider Terminal Options: ");
      System.out.println("(B) - Bill Chocan for Service");
      System.out.println("(R) - Request Provider Directory");
      System.out.println("(Q) - Exit menu");
      String input = myScanner.nextLine();

      switch (input) {
        case("B"):
          break;
        case("R"):
          System.out.println("Printing provider directory.");
          ProviderController provController = new ProviderController();
          provController.printProviderDirectory();
          break;
        default:
          return;
          

 
      }
    }
  }
}
