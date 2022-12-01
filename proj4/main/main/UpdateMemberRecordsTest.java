package main.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Tests editing member information.
 *
 * @author gabec
 *
 */
public class UpdateMemberRecordsTest {
  static String memberName = "John Smith";
  int memberNumber = 200200200;
  boolean suspendedMember = false;
  static String streetAddress = "123 Main Street";
  static String city = "Tuscaloosa";
  static String state = "AL";
  static String zip = "35401";
  static Member newMember;

  /**
   * Creates a new Member object to test on.
   *
   * @author gabec
   */
  @BeforeClass
  public static void setUp() throws Exception {
    newMember = new Member(memberName, streetAddress, city, state, zip);
    newMember.setMemberName("Jack Smith");
    newMember.setSuspendedStatus(false);
    newMember.setMemberNumber(200200200);
  }
  
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSetName() {
    assertEquals("Jack Smith", newMember.getMemberName());
  }
  
  @Test
  public void testSetSuspension() {
    assertEquals(false, newMember.isSuspended());
  }
  
  @Test
  public void testGetMemberNumber() {
    assertEquals(200200200, newMember.getMemberNumber());
  }
}
