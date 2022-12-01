package main.main;

import static org.junit.Assert.*;

import org.junit.After.*;
import org.junit.Before.*;
import org.junit.Test.*;

import main.main.Member;

/**
 * Tests editing member information.
 *
 * @author gabec
 *
 */
public class UpdateMemberRecordsTest {
  String memberName = "John Smith";
  int memberNumber = 200200200;
  boolean suspendedMember = false;
  String streetAddress = "123 Main Street";
  String city = "Tuscaloosa";
  String state = "AL";
  String zip = "35401";
  Member newMember;

  @Before
  public void setUp() throws Exception {
    newMember = new Member(memberName, streetAddress, city, state, zip);
    newMember.setMemberName("Jack Smith");
    newMember.setSuspendedStatus(false);
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
