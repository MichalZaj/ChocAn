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
    
    
    Operator caleb = new Operator(123);
    Manager thomas = new Manager(123);
    Provider gabe = new Provider(123);
    
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
          break;
        case('O'):
          System.out.println("Entering Operator Terminal");
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
