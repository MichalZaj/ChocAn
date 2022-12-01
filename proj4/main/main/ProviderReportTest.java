package main.main;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**Tests features of ProviderReport.
 *
 * @author BrentC 
 *
 */


public class ProviderReportTest {
  ProviderReport providerReportTest = new ProviderReport(1234);
  Service serviceTest = new Service("Snap", "Crackle", 1, 2, 999999, "Pop");
	
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }
  
  public void addService() {
    providerReportTest.addService(serviceTest);
  }
	
  @Test
  public void serviceCodeTest() { //makes sure service and the service code are being properly added
    for (int i = 0; i < 10; i++) {
      addService();
    }
    assertTrue(providerReportTest.serviceArray.get(7).getServiceCode() == 999999);
  }
	
	
  @Test
  public void serviceDayOfRecordTest() { //makes sure service and comments are being properly added
    for (int i = 0; i < 10; i++) {
      addService();
    }
    assertTrue(providerReportTest.serviceArray.get(9).getComments() == "Pop"); 
  }
	
  @Test
  public void feeTest() { // makes sure the fee is being properly added up
    for (int i = 0; i < 10; i++) {
      addService();
    }
    assertTrue(providerReportTest.getFee() == 1000.00);
  }
}