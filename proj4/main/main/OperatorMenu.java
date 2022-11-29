package main.main;

import java.util.Scanner;

/**
 * This class runs operator menu options.

 * @author cjmes
 */


public class OperatorMenu {
  RecordsController myController = new RecordsController();
  
  /**
   * Constructor for operator menu. Allows access to operator menu methods.
   */
  public OperatorMenu() {

  }
  
  /**
   * This is the main prompt the runs all menu options.
   */
  public void prompt() {
    Scanner myScanner = new Scanner(System.in);
    
    while (true) {
      System.out.println("Operator Terminal Options: ");
      System.out.println("(M) - Update Member Records");
      System.out.println("(P) - Update Provider Records");
      System.out.println("(Q) - Exit operator terminal");
      System.out.println("(-) - Close System");
    
      String input = myScanner.nextLine();
    
      switch (input) {
        case("M"):
          myController.promptForMemberChanges();
          break;
      
      
        case("P"):
          myController.promptForProviderChanges();
          break;
        
        case("Q"):
          System.out.println("Exiting operator terminal");
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
