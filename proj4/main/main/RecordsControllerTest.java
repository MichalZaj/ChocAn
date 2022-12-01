package main.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This JUnit tests the use case of updatingProvider.

 * @author Michal
 *
 */

public class RecordsControllerTest {
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
  public void testChangeProviderName() {
    myRecords.addProvider("Michal");
    int provNum = RecordsController.providerRecordsArray.get(0).getProviderNumber();
    myRecords.changeProviderName(provNum, "Caleb");
    String changedName = myRecords.getProvName(provNum);
    assertEquals("Caleb", changedName);
  }

  @Test
  public void testAddProvider() {
    myRecords.addProvider("Michal");
    int provNum = RecordsController.providerRecordsArray.get(0).getProviderNumber();
    assertTrue(verMenu.verifyProvider(provNum));
  }

  @Test
  public void testDeleteProvider() {
    myRecords.addProvider("Caleb");
    int provNum = RecordsController.providerRecordsArray.get(0).getProviderNumber();
    assertTrue(verMenu.verifyProvider(provNum));
    
    myRecords.deleteProvider(provNum);
    assertFalse(verMenu.verifyProvider(provNum));
  }

}
