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

    while (true) {
      
      System.out.println("Manager Terminal Options: ");
      System.out.println("(E) - Access EFT Report");
      System.out.println("(P) - Access Provider Report");
      System.out.println("(M) - Access Member Report");
      System.out.println("(S) - Access Summary Report");
      System.out.println("(Q) - Exit operator terminal");
      System.out.println("(-) - Exit system");

      String input = myScanner.nextLine();

      switch (input) {
        case("E"):
          System.out.println("Generating EFT Report.");
          manController.printEftReport();
          break;

        case("P"):
          System.out.println("Generating Provider Report.");
          manController.printProviderReport();
          break;

        case("M"):
          System.out.println("Generating Member Report.");
          manController.printMemberReport();
          break;

        case("S"):
          System.out.println("Generating Summary Report.");
          manController.printSummaryReport();
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
          System.out.println("Invalid Input");
          break;

      }
    }
    
  }
}
