package main.main;

import java.util.Scanner;

public class VerificationMenu {
  //member variables
  int numProviders = 1;
  int[] validProviderNums = new int[10];
  
  int numManagers = 1;
  int[] validManagerNums = new int[10];
  
  int numOperators = 1;
  int[] validOperatorNums = new int[10];
  
  public char promptMenu() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please select type of user:");
    System.out.println("(P) - Provider");
    System.out.println("(O) - Operator");
    System.out.println("(M) - Manager");
    
    String input = s.nextLine();
    int verificationNum;
    char result = 'F';
    switch (input) {
      case("P"):
        System.out.println("Verifying Provider Selected");
        System.out.println("Enter provider number: ");
        verificationNum = s.nextInt();
        result = verifyProvider(verificationNum);
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

      default:
        System.out.println("Invalid input");
        break;
    }
    //s.close();
    return result;
  }
  
  public VerificationMenu() {
    validProviderNums[0] = 123;
    validOperatorNums[0] = 123;
    validManagerNums[0] = 123;
  }
  
  public char verifyProvider(int num) {
    for (int i = 0; i < numProviders; i++) {
      if (num == validProviderNums[i]) {
        return 'P';
      }
    }
    return 'F';
  }
  
  public char verifyOperator(int num) {
    for (int i = 0; i < numOperators; i++) {
      if (num == validOperatorNums[i]) {
        return 'O';
      }
    }
    return 'F';
  }
  
  public char verifyManager(int num) {
    for (int i = 0; i < numManagers; i++) {
      if (num == validManagerNums[i]) {
        return 'M';
      }
    }
    return 'F';
  }
  
  
  
  
}
