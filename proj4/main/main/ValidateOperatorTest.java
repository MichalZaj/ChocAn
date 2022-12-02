package main.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This Junit test tests the use case of verifying operator.

 * @author BrentC
 *
 */

public class ValidateOperatorTest {
  VerificationMenu verMenu;
  Operator operator;
  OperatorMenu opMenu;
  
  /**
   * Sets up tests.

   * 
   *
   */
  @Before
  public void setUp() throws Exception {
    verMenu = new VerificationMenu();
    operator = new Operator(1234567890);
    opMenu = new OperatorMenu();
  }
  
  @After
  public void tearDown() throws Exception {
  }


  @Test
  public void verifyOperatorTest() {
    //This should assert true, as the operator exists. The character will not return f for false
    assertFalse(verMenu.verifyOperator(1234567890) == 'f');
  }
  
  @Test
  public void getOperatorNumberTest() { //checks that the number was correctly stored. 
    assertTrue(operator.getOpNumber() == 1234567890);
  }
  
  @Test
  public void operatorAddProvider() { //operator is verified - can now add provider and get name
    opMenu.myController.addProvider("Bill Gates");
    assertTrue(opMenu.myController.providerRecordsArray.get(0).getProviderName() == "Bill Gates");
   
   

  }
}