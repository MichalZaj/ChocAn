package main.main;

/**
 * 
 * @author cjmes
 * 
 */

import java.util.Scanner;

public class OperatorMenu {
  
  public OperatorMenu() {

  }
  
  public void prompt() {
    Scanner myScanner = new Scanner(System.in);
    
    while (true) {
      System.out.println("Operator Terminal Options: ");
      System.out.println("(P) - Update Provider Records");
      System.out.println("(O) - Update Operator Records");
      System.out.println("(Q) - Exit operator terminal");
    
      String input = myScanner.nextLine();
    
      switch (input) {
        case("P"):
          break;
      
      
        case("O"):
          break;
          
        default:
          System.out.println("Exiting operator terminal");
          return;
          
    
    
      }
    }
  }
}
