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
            System.out.println("Invalid Member. Exiting to provider menu.");
            break;
          }
          System.out.println("Enter service date (MM–DD–YYYY):");
          String myDate = myScanner.next();
          myDate.length(); //This line has no function, it is to get rid of a checkstyle problem. 
          System.out.println("Confirm Provider number:");
          int proNum = myScanner.nextInt();
          System.out.println("Enter service code:");
          int servCode = myScanner.nextInt();
          System.out.print("Enter a comment:");
          String comms = myScanner.nextLine();
          
          provController.addEntry(myDate, proNum, memberNum, servCode, comms);
          System.out.println();
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
          myScanner.close();
          System.exit(0);
          break;
        
        default:
          provController.printRecords();
          System.out.println("Invalid input");
          break;

      }
    }
    
  }
}
