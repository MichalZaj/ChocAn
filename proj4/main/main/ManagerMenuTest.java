package main.main;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ManagerMenuTest {
	
	static ManagerMenu menu; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		menu = new ManagerMenu();
		PrintStream out; 
	    System.setOut(out);
	}

	@Test
	void testprompt() {
	    menu.prompt();
	    assertNotNull(out);
		fail("Not yet implemented");
	}
	void testEft() {
	    menu.prompt();
	    String input = "E";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    input = "-";
	    in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    assertNotNull(out);
		fail("Not yet implemented");
	}
	void testSummary() {
	    menu.prompt();
	    String input = "Q";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    assertEquals("Exiting manager terminal", out);
		fail("Not yet implemented");
	}
}
