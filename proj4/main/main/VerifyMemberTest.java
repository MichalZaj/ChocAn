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
  
  @Test
  public void testGetMemberNumber() {
    int result = member.getMemberNumber();
    assertNotNull(result);
  }
  
  @Test
  public void testSearchMember() {
    boolean result = records.searchMember(000000000);
    assertFalse(result);
  }

  @Test
  public void testVerifyMember() {
    boolean result = menu.verifyMember(000000000);
    assertFalse(result);
  }
}
