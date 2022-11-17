package main.main;

import java.util.Scanner;

/**
 * This is the provider menu class.

 * @author cjmes

 */

public class ProviderMenu {
  
  ProviderController provController;
  VerificationMenu verMenu;
  
  public ProviderMenu() {
    provController = new ProviderController();
    verMenu = new VerificationMenu();
    
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
      System.out.println("(-) - Close System");
      String input = myScanner.next();

      switch (input) {
        case("B"):
          
          System.out.println("Billing Chocan for Service.");
          System.out.println("Enter member number for verification:");
          int memberNum = myScanner.nextInt();
          boolean validMember = verMenu.verifyMember(memberNum);
          if (validMember) {
            System.out.println("Valid Member.");
          } else {
            System.out.println("Invalid Member.");
          }
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
        
        case("Q"):
          System.out.println("Exiting Provider terminal.");
          return;
        case("-"):
          System.out.println("Closing system. Goodbye!");
          System.exit(0);
          break;
        
        default:
          System.out.println("Invalid input");
          break;

      }
    }
  }
}
