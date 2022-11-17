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
    RecordsController myRecord = new RecordsController();
    
    //This sets a Member account for Trina Locklear, so she is able to access the whole system
    //Her code is 200200200
    myRecord.addMember("Trina Locklear");
    RecordsController.memberRecordsArray.get(0).setMemberNumber(200200200);
    
    //This sets a Provider account for Trina Locklear, so she is able to access the whole system
    //Her code is 200200200
    myRecord.addProvider("Dr. Trina Locklear");
    RecordsController.providerRecordsArray.get(0).setProviderNumber(200200200);
    
    
    
    
    
    
    VerificationMenu myMenu = new VerificationMenu();
    String sentinelValue = "A";
    while (!sentinelValue.equals("Q")) {
      System.out.println("Welcome to Chocan System.");

      
      
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
          break;
        case('T'):
          System.out.println("Starting Main Accounting Procedure");
          break;
        case('-'):
          System.out.println("Closing system. Goodbye!");
          System.exit(1);
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
