package hello;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class HelloTestNG {
	@Test
	public void hi() {
		String s = "helloTestNG";
		assertEquals("helloTestNG", s);
		assertNotEquals("goodbyeJunit", s);
	}
}
