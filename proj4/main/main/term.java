package main.main;

import java.util.Scanner;
/**
 * 
 *    @author cjmes
 *    
 *    This is the main file that runs the system
 */

public class term {
	


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    
    
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
          ProviderMenu proMenu = new ProviderMenu();
          proMenu.prompt();
          break;
        case('O'):
          System.out.println("Entering Operator Terminal");
          OperatorMenu opMenu = new OperatorMenu();
          opMenu.prompt();
          break;
        case('M'):
          System.out.println("Entering Manager Terminal");
        
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
