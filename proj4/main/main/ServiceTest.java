package main.main;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**ServiceTest tests various abilities of the service class, including getting and setting stuff.
 *
 * @author thoma
 *
 */

public class ServiceTest {

  Service serv = new Service("hi", "there", 4, 5, 6, "friend");

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @Test
  public void testgpn() {
    int th = serv.getProviderNumber();
    assertTrue(th != 0);
  }
    
  @Test
  public void testgmn() {
    int th = serv.getProviderNumber();
    assertTrue(th != 0);
  }
	
  @Test
  public void testsc() {
    serv.setServiceCode(69);
    assertTrue(serv.getServiceCode() == 69);
  }
}
