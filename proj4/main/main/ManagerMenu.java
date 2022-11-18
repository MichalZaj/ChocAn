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

      String input = myScanner.nextLine();

      switch (input) {
        case("E"):
          System.out.println("Printing EFT Report.");
          manController.createEftReport();
          manController.printEftReport();
          break;

        case("P"):
          System.out.println("Printing Provider Report.");
          manController.createProviderReport();
          manController.printProviderReport();
          break;

        case("M"):
          System.out.println("Printing Member Report.");
          manController.createMemberReport();
          manController.printMemberReport();
          break;

        case("S"):
          System.out.println("Printing Summary Report.");
          manController.createSummaryReport();
          manController.printSummaryReport();
          break;

        default:
          System.out.println("Exiting operator terminal");
          myScanner.close();
          return;

      }
    }
    
  }
}
