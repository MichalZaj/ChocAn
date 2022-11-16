package main.main;

import java.util.Scanner;
/**
 * 
 *    @author cjmes
 *    
 *    This is the main file that runs the system
 */

public class Term {
	


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ProviderMenu proMenu = new ProviderMenu();
    OperatorMenu opMenu = new OperatorMenu();
    
    
    
    VerificationMenu myMenu = new VerificationMenu();
    String sentinelValue = "A";
    while (!sentinelValue.equals("Q")) {
      System.out.println("Welcome to Chocan System.");
      System.out.println("Q to quit, any other value to move into verification step.");
      sentinelValue = s.next();
      if (sentinelValue.equals("Q")) {
        System.out.println("Exiting system. Goodbye!");
        break;
      }
      
      
      char verificationPassed = myMenu.promptMenu();

      switch (verificationPassed) {
        case('P'):
          System.out.println("Entering Provider Terminal");
          proMenu = new ProviderMenu();
          proMenu.prompt();
          break;
        case('O'):
          System.out.println("Entering Operator Terminal");
          opMenu = new OperatorMenu();
          opMenu.prompt();
          break;
        case('M'):
          System.out.println("Entering Manager Terminal");
          ManagerMenu manMenu = new ManagerMenu(); 
          manMenu.prompt();
        case('T'):
          System.out.println("Starting Main Accounting Procedure");
          
          break;
        default:
          System.out.println("Verification Failed");
          break;
      }
      
      System.out.println('\n');
    }
    s.close();
    
    
  }

}
