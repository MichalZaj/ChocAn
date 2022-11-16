package main.main;

/**
 * This is the provider menu class.

 * @author cjmes
 * 
 */

import java.util.Scanner;

/**
 * Provider menu constructor.
 */

public class ProviderMenu {
  
  ProviderController provController;
  
  public ProviderMenu() {
    provController = new ProviderController();
  }
  
  /**
   * Main menu prompt.
   */
  
  public void prompt() {
    Scanner myScanner = new Scanner(System.in);
    while (true) {
      System.out.println("Provider Terminal Options: ");
      System.out.println("(B) - Bill Chocan for Service");
      System.out.println("(R) - Request Provider Directory");
      System.out.println("(S) - Search Provider Directory");
      System.out.println("(Q) - Exit menu");
      String input = myScanner.nextLine();

      switch (input) {
        case("B"):
          break;
        case("R"):
          System.out.println("Printing provider directory.");
          provController.printProviderDirectory();
          break;
        case("S"):
          System.out.println("Searching provider directory");
          System.out.println("Enter 6 digit search code:");
          int searchVal = myScanner.nextInt();
          provController.searchProviderDirectory(searchVal);
          break;
          
        default:
          return;
          

 
      }
    }
  }
}
