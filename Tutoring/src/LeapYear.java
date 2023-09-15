import static org.junit.Assert.*;

import org.junit.Test;

import test.DecisionStructures;

public class LeapYear {

	@Test
	public void test1() {
		DecisionStructures d = new DecisionStructures(2024);
		assertTrue(d.isLeap());
	}
	@Test
	public void test2() {
		DecisionStructures d = new DecisionStructures(1900);
		assertFalse(d.isLeap());
	}
	@Test
	public void test3() {
		DecisionStructures d = new DecisionStructures(2000);
		assertTrue(d.isLeap());
	}

}
