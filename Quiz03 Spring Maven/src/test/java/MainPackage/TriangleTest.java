package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetArea() {
		Triangle t1 = new Triangle();
		assertEquals(0.433, t1.getArea(), .001);
	}
	
	@Test
	public void testGetPerimeter() {
		Triangle t2 = new Triangle(3, 4, 5);
		assertEquals(12, t2.getPerimeter(), .001);
	}

}
