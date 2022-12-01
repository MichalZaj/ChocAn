package main.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This Junit test tests the use case of verifiying provider.

 * @author cjmes
 *
 */

public class VerifiyProviderTest {
  VerificationMenu verMenu;
  RecordsController myRecords;
 
  @Before
  public void setUp() throws Exception {
    verMenu = new VerificationMenu();
    myRecords = new RecordsController();
  }
  
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void verifyProviderThatDoesntExist() {
    //This should assert false, as the member has not yet been created
    assertFalse(verMenu.verifyProvider(123123123));
  }
  
  @Test
  public void verifyMemberThatDoesExist() {
    myRecords.addProvider("Caleb");
    int provNum = RecordsController.providerRecordsArray.get(0).getProviderNumber();
    assertTrue(verMenu.verifyProvider(provNum));
  }
  
  @Test
  public void verifyDeletedProvider() {
    myRecords.addProvider("Caleb");
    int provNum = RecordsController.providerRecordsArray.get(0).getProviderNumber();
    assertTrue(verMenu.verifyProvider(provNum));
    
    myRecords.deleteProvider(provNum);
    assertFalse(verMenu.verifyProvider(provNum));
  }

}
