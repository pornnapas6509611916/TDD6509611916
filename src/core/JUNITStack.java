package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	public void testCreateNewStack() {
		Stack s1 = new Stack();
		s1.push(1);
		s1.pop();
		assertNull(s1);

}
	public void testCreateNewFullStack() {
		Stack s1 = new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.pop();
		assertTrue(s1.isFull());

}

}