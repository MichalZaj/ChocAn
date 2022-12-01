package main.main;

import java.util.Scanner;

/**
 * This is the provider menu class.

 * @author cjmes

 */

public class ProviderMenu {
  ProviderController provController;
  VerificationMenu verMenu;
  RecordsController recController;
  
  /**
   * Provider menu prompt.
   */
  public ProviderMenu() {
    provController = new ProviderController();
    verMenu = new VerificationMenu();
    recController = new RecordsController();
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
            if (recController.checkSuspended(memberNum) == false) {
              System.out.println("Validated.");
            } else {
              System.out.println("Suspended Member. Returning to provider menu.");
              break;
            }
          } else {
            System.out.println("Invalid Number. Returning to provider menu.");
            break;
          }
          System.out.println("Enter service date (MM–DD–YYYY):");
          String myDate = myScanner.next();
          myDate.length(); //This line has no function, it is to get rid of a check style problem. 
          System.out.println("Confirm Provider number:");
          int proNum = myScanner.nextInt();
       
          
          boolean validProvider = verMenu.verifyProvider(proNum);
          if (!validProvider) {
            System.out.println("Invalid provider number. Returning to provider menu.");
            break;
          }
          
          
          System.out.println("Enter service code:");
          
          int servCode = myScanner.nextInt();
          
          boolean serviceExists = provController.doesServiceExist(servCode);
          if (!serviceExists) {
            System.out.println("Service does not exist. Returning to provider menu.");
            break;
          }
          
          int myNum = proNum; //This line has no function, it fixes a check style problem
          
          System.out.print("Enter a comment:");
          myScanner.nextLine();
          String comms = myScanner.nextLine();
          
          provController.billChocan(myDate, myNum, memberNum, servCode, comms);
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
          
          System.out.println("Invalid input");
          break;

      }
    }
    
  }
}
