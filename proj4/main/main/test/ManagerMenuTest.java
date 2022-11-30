package main.main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.main.ManagerMenu;

class ManagerMenuTest {
	
	ManagerMenu menu; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		menu = new ManagerMenu();
	}

	@Test
	void test() {
		menu.prompt(); 
		
		fail("Not yet implemented");
	}

}
