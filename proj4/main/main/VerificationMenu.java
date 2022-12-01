package main.main;

import java.util.Scanner;

/**
 * This menu runs the verification process.

 * @author cjmes
 *
 */

public class VerificationMenu {
  //member variables
  
  int numManagers = 1;
  int[] validManagerNums = new int[10];
  
  int numOperators = 1;
  int[] validOperatorNums = new int[10];
  
  RecordsController myController;
  
  /**
   * Prompts the verification menu.

   * @return the desired menu to join and resultant permissions 
   
   */
  
  public char promptMenu() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please select verification type, or close system:");
    System.out.println("(P) - Provider");
    System.out.println("(O) - Operator");
    System.out.println("(M) - Manager");
    System.out.println("(T) - Run main Accounting Procedure");
    System.out.println("(-) - Close System");
    
    String input = s.nextLine();
    int verificationNum;
    boolean isValid;
    char result = 'F';
    switch (input) {
      case("P"):
        System.out.println("Verifying Provider Selected");
        System.out.println("Enter provider number: ");
        verificationNum = s.nextInt();
        
        isValid = myController.searchProvider(verificationNum);
        if (isValid) {
          result = 'P';
        }
        break;
      case("O"):
        System.out.println("Verifying Operator Selected");
        System.out.println("Enter operator number: ");
        verificationNum = s.nextInt();
        result = verifyOperator(verificationNum);
        break;
      case("M"):
        System.out.println("Verifying Manager Selected");
        System.out.println("Enter manager number: ");
        verificationNum = s.nextInt();
        result = verifyManager(verificationNum);
        break;
      case("-"):
        System.out.println("Closing system. Goodbye!");
        s.close();
        System.exit(1);
        break;
      case("T"):
        result = 'T';
        break;

      default:
        System.out.println("Invalid input");
        break;
    }
    
    return result;
  }
  
  /**
   * Constructor.
   */
  public VerificationMenu() {
    validOperatorNums[0] = 200200200;
    validManagerNums[0] = 200200200;
    myController = new RecordsController();
  }
  

 
  
  
  /**
   * Verifies operator.

   * @param num given provider number

   * @return fail or success
   */
  public char verifyOperator(int num) {
    for (int i = 0; i < numOperators; i++) {
      if (num == validOperatorNums[i]) {
        return 'O';
      }
    }
    return 'F';
  }
  
  /**
   * Verifies member.

   * @param num member number.

   * @return true if valid, false if not.
   */
  public boolean verifyMember(int num) {
    boolean result = false;
    boolean isValid = myController.searchMember(num);
    if (isValid) {
      result = true;
    }
    return result;
  }
  
  /**
   * Verifies provider.

   * @param num is the desired provider number.

   * @return returns true if provider is valid, false if not.
   */
  public boolean verifyProvider(int num) {
    boolean result = false;
    boolean isValid = myController.searchProvider(num);
    if (isValid) {
      result = true;
    }
    return result; 
  }
  
  /**
   * Verifies manager.

   * @param num given provider number

   * @return fail or success
   */
  public char verifyManager(int num) {
    for (int i = 0; i < numManagers; i++) {
      if (num == validManagerNums[i]) {
        return 'M';
      }
    }
    return 'F';
  }
}
