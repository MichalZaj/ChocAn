package main.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Tests the feature of verifying a member.

 * @author cpaier
 *
 */
public class VerifyMemberTest {
  Member member =  new Member("test", "test", "test", "test", "test");
  VerificationMenu menu = new VerificationMenu();
  RecordsController records = new RecordsController();
  
  /**
   * Verifies that a member number is generated for any member that exists in the system.
   */
  @Test
  public void testGetMemberNumber() { 
    int result = member.getMemberNumber();
    assertNotNull(result);
  }
  
  /**
   * Verifies that if an invalid member is searched for, the searchMember method will return false.
   */
  @Test
  public void testSearchMember() {
    boolean result = records.searchMember(000000000);
    assertFalse(result);
  }

  /**
   * If an invalid member is attempting to be verified, the verifyMember method will return false.
   * Done by entering an invalid member number.
   */
  @Test
  public void testVerifyMember() {
    boolean result = menu.verifyMember(000000000);
    assertFalse(result);
  }
}
