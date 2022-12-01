package main.main;

import java.util.Scanner;

/** 
 * Manager Menu contains all options for the manager and allows the manager to select them. 
 *
 * @author thoma
 *  
 */

public class ManagerMenu {

  public ManagerMenu() {
    
  }
  
  /**
   * Prompt is the option selection process. 
   */
  public void prompt() {
    Scanner myScanner = new Scanner(System.in);
    ManagerController manController = new ManagerController();
    VerificationMenu verMenu = new VerificationMenu();

    while (true) {
      
      System.out.println("Manager Terminal Options: ");
      System.out.println("(E) - Access EFT Report");
      System.out.println("(P) - Access Provider Report");
      System.out.println("(M) - Access Member Report");
      System.out.println("(S) - Access Summary Report");
      System.out.println("(Q) - Exit manager terminal.");
      System.out.println("(-) - Exit system");
      System.out.println();

      String input = myScanner.next();

      switch (input) {
        case("E"):
          System.out.println("Generating EFT Report.");
          manController.printEftReport();
          System.out.println("");
          System.out.println("");
          break;

        case("P"):  
          System.out.println("Enter a valid provider number: ");
          int provNum = myScanner.nextInt();
          boolean validProv = verMenu.verifyProvider(provNum);
          if (!validProv) {
            System.out.println("Invalid provider. Exiting to manager menu.");
            break;
          }
          
          System.out.println("Generating Provider Report.");
          boolean reportPrinted = manController.printProviderReport(provNum);
          if (!reportPrinted) {
            System.out.print("This provider has no report, as they");
            System.out.println(" have not charged any services this week.");
          }
          
          System.out.println("");
          System.out.println("");
          break;

        case("M"):
          System.out.print("Enter a valid member number: ");
          int memNum = myScanner.nextInt();
          boolean validMember = verMenu.verifyMember(memNum);
          if (!validMember) {
            System.out.println("Invalid member. Exiting to manager menu.");
            break;
          }

          System.out.println("Generating Member Report.");
          boolean memReportPrinted = manController.printMemberReport(memNum);
          if (!memReportPrinted) {
            System.out.print("This member has no report, as they have not charged");
            System.out.println(" any services this week.");
          }
          
          
          System.out.println("");
          System.out.println("");
          break;

        case("S"):
          System.out.println("Generating Summary Report.");
          manController.printSummaryReport();
          System.out.println("");
          System.out.println("");
          break;
          
        case("Q"):
          System.out.println("Exiting manager terminal");
          return;

        case("-"):
          System.out.println("Closing system. Goodbye!");
          myScanner.close();
          System.exit(0);
          break;
          
        default:
          System.out.println("Invalid Input!");
          System.out.println("");
          System.out.println("");
          break;

      }
    }
    
  }
}
